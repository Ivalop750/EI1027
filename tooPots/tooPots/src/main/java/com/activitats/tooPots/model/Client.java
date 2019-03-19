package com.activitats.tooPots.model;

import java.util.Set;
import java.util.Date;
import java.util.HashSet;

public class Client {
	String idClient;
	String nom;
	String email;
	String sexe;
	Date dataNaixement; 
	
	public String getIdClient() {
		return idClient;
	}



	public void setIdClient(String id_client) {
		this.idClient = id_client;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSexe() {
		return sexe;
	}



	public void setSexe(String sexe) {
		this.sexe = sexe;
	}



	public Date getDataNaixement() {
		return dataNaixement;
	}



	public void setDataNaixement(Date data_naixement) {
		this.dataNaixement = data_naixement;
	}




	
	
	@Override
	public String toString() {
		return "Client[nom=" + nom + ", id_client=" + idClient + ", email="
				+ email + ", sexe=" + sexe + ", data_naixement="
				+ dataNaixement + "]";
	} 
}

