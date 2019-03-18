package com.activitats.tooPots.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.activitats.tooPots.model.Acreditacio;


@Repository
public class AcreditacioDao {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setDataSource(DataSource dataSource) {
	        this.jdbcTemplate = new JdbcTemplate(dataSource); 
	}
	private static final class AcreditacioMapper implements RowMapper<Acreditacio> { 
		 public Acreditacio mapRow(ResultSet rs, int rowNum) throws SQLException { 
		        Acreditacio acreditacio = new Acreditacio();
		        acreditacio.setIdInstructor(rs.getString("id_instructor"));
		        acreditacio.setNomTipusActivitat(rs.getString("nom_tipus_activitat"));
		        acreditacio.setCertificatUrl(rs.getString("certificat_url"));
		        acreditacio.setEstat(rs.getString("estat"));
		        return acreditacio;
		    }
	}
	
	public List<Acreditacio> getAcreditacions(){
		return this.jdbcTemplate.query(
				"select * from acreditacio", new AcreditacioMapper());
	}
	public Acreditacio getAcreditacio(String idInstructor, String nomTipusActivitat){
		return this.jdbcTemplate.queryForObject(
				"select * from acreditacio where id_instructor=? AND nom_tipus_activitat=? ",
				new Object[] {idInstructor,nomTipusActivitat}, new AcreditacioMapper());
	}
	
	public void addAcreditacio(Acreditacio acreditacio) {
		this.jdbcTemplate.update(
				"insert into Acreditacio(id_instructor,nom_tipus_activitat,certificat_url,estat) values(?,?,?,?)",
				acreditacio.getIdInstructor(), acreditacio.getNomTipusActivitat(), 
				acreditacio.getCertificatUrl(),acreditacio.getEstat() );
	}
	
	public void updateInstructor(Acreditacio acreditacio) {
		this.jdbcTemplate.update("update Acreditacio set certificat_url=?,estat=? "
				+ "where id_instructor=? AND nom_tipus_activitat=?",
				acreditacio.getCertificatUrl(), acreditacio.getEstat(), acreditacio.getIdInstructor(), acreditacio.getNomTipusActivitat());
	}
	public void deleteInstructor(String idInstructor, String nomTipusActivitat) {
		this.jdbcTemplate.update("delete from acreditacio where id_instructor=? AND nom_tipus_activitat=?", idInstructor, nomTipusActivitat);
	}
	
}
