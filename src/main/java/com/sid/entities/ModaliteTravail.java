package com.sid.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ModaliteTravail implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int nbrHeure;
	private double prixHeure;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNbrHeure() {
		return nbrHeure;
	}

	public void setNbrHeure(int nbrHeure) {
		this.nbrHeure = nbrHeure;
	}

	public double getPrixHeure() {
		return prixHeure;
	}

	public void setPrixHeure(double prixHeure) {
		this.prixHeure = prixHeure;
	}

	

	

	public ModaliteTravail() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
