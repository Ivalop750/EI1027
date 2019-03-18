package com.activitats.tooPots.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.activitats.tooPots.model.Nivell;

public class NivellMapper implements RowMapper<Nivell>{

	@Override
	public Nivell mapRow(ResultSet rs, int rowNum) throws SQLException {
		Nivell nivell = new Nivell();
		nivell.setNivellId(rs.getShort("id"));
		nivell.setDescripcio(rs.getString("descripcio"));
		return nivell;
	}

}
