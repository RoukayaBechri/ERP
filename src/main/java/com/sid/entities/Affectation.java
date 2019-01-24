package com.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Affectation implements Serializable {
	@EmbeddedId
	private TravailleAPk travailleAPk;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	private boolean isActif;

	@ManyToOne(optional=false)
    @JoinColumn(name="idAgent",insertable=false,updatable=false)
    private Agent agent;
	
	@ManyToOne(optional=false)
    @JoinColumn(name="idSite",insertable=false,updatable=false)
    private Site site;
	
	public TravailleAPk getTravailleAPk() {
		return travailleAPk;
	}
	public void setTravailleAPk(TravailleAPk travailleAPk) {
		this.travailleAPk = travailleAPk;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public boolean isActif() {
		return isActif;
	}
	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}
	public Affectation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
