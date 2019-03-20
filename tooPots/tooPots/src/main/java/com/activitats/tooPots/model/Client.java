package com.activitats.tooPots.model;

import java.util.Set;
import java.util.Date;
import java.util.HashSet;

public class Client {
	String clientId;
	String nom;
	String email;
	String sexe;
	Date dataNaixement; 
	
	public String getClientId() {
		return clientId;
	}



	public void setClientId(String id_client) {
		this.clientId = id_client;
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
		return "Client[nom=" + nom + ", id_client=" + clientId + ", email="
				+ email + ", sexe=" + sexe + ", data_naixement="
				+ dataNaixement + "]";
	} 
}

