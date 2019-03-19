package com.activitats.tooPots.model;

import java.sql.Time;
import java.util.Date;

public class Activitat {
	String nomLlarg;
	String estat;
	String descripcio;
	Float durada;
	Date data;
	Float preu;
	Integer min_Assistents;
	Integer max_Assistents;
	String lloc;
	String punt_De_Trobada;
	Time hora_De_Trobada;
	String text_Per_Client;
	String id_Instructor;
	String nom_Tipus_Activitat;
	public String getNomLlarg() {
		return nomLlarg;
	}
	public void setNomLlarg(String nomLlarg) {
		this.nomLlarg = nomLlarg;
	}
	public String getEstat() {
		return estat;
	}
	public void setEstat(String estat) {
		this.estat = estat;
	}
	public String getDescripcio() {
		return descripcio;
	}
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	public Float getDurada() {
		return durada;
	}
	public void setDurada(Float durada) {
		this.durada = durada;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Float getPreu() {
		return preu;
	}
	public void setPreu(Float preu) {
		this.preu = preu;
	}
	public Integer getMin_Assistents() {
		return min_Assistents;
	}
	public void setMin_Assistents(Integer min_Assistents) {
		this.min_Assistents = min_Assistents;
	}
	public Integer getMax_Assistents() {
		return max_Assistents;
	}
	public void setMax_Assistents(Integer max_Assistents) {
		this.max_Assistents = max_Assistents;
	}
	public String getLloc() {
		return lloc;
	}
	public void setLloc(String lloc) {
		this.lloc = lloc;
	}
	public String getPunt_De_Trobada() {
		return punt_De_Trobada;
	}
	public void setPunt_De_Trobada(String punt_De_Trobada) {
		this.punt_De_Trobada = punt_De_Trobada;
	}
	public Time getHora_De_Trobada() {
		return hora_De_Trobada;
	}
	public void setHora_De_Trobada(Time hora_De_Trobada) {
		this.hora_De_Trobada = hora_De_Trobada;
	}
	public String getText_Per_Client() {
		return text_Per_Client;
	}
	public void setText_Per_Client(String text_Per_Client) {
		this.text_Per_Client = text_Per_Client;
	}
	public String getId_Instructor() {
		return id_Instructor;
	}
	public void setId_Instructor(String id_Instructor) {
		this.id_Instructor = id_Instructor;
	}
	public String getNom_Tipus_Activitat() {
		return nom_Tipus_Activitat;
	}
	public void setNom_Tipus_Activitat(String nom_Tipus_Activitat) {
		this.nom_Tipus_Activitat = nom_Tipus_Activitat;
	}
	
}
