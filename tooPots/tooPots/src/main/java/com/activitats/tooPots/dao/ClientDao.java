package com.activitats.tooPots.dao;

import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.activitats.tooPots.model.Client;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;

public class ClientDao{
    
	private JdbcTemplate jdbcTemplate;
	private static final class ClientMapper implements RowMapper<Client> { 

	    public Client mapRow(ResultSet rs, int rowNum) throws SQLException { 
	        Client client = new Client();
	        client.setNom(rs.getString("nom"));
	        client.setEmail(rs.getString("email"));
	        client.setDataNaixement(rs.getDate("data_naixement"));
	        client.setIdClient(rs.getString("id_client"));
	        client.setSexe(rs.getString("sexe"));
	        return client;
	    }
	}


	
	public void addClient(Client client) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update(
				"insert into Client(id_client,nom,email,data_naixement,sexe) values(?,?,?,?,?)",
				client.getIdClient(), client.getNom(), client.getEmail(), client.getDataNaixement() ,
				client.getSexe() );
		
	}

	public Client getClient(String idClient) {
		return this.jdbcTemplate.queryForObject(
				"select * from Client where id_client=?  ",
				new Object[] {idClient}, new ClientMapper());
	}

	
	public void deleteClient(String idClient) {
		this.jdbcTemplate.update("delete from Client where id_client=?", idClient);
	}		
	

	
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update Client nom=?,email=?,sexe=?,data_naixement=? "
				+ "where id_client=?",
			 client.getNom(), client.getEmail(), client.getSexe(),client.getDataNaixement() ,
					client.getIdClient());
	}
	

	
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.query(
				"select * from Client", new ClientMapper());
	}
}
