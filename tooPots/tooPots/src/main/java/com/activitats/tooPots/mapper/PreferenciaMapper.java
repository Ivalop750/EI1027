package com.activitats.tooPots.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.activitats.tooPots.model.Preferencia;

public class PreferenciaMapper implements RowMapper<Preferencia>{

	@Override
	public Preferencia mapRow(ResultSet rs, int rowNum) throws SQLException {
		Preferencia preferencia = new Preferencia();
		preferencia.setPreferenciaId(rs.getShort("id"));
		preferencia.setNomTipusActivitat(rs.getString("nom_tipus_activitat"));
		return preferencia;
	}
}
