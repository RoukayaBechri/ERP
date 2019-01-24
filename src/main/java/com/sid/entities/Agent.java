package com.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Agent implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String lastname;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	private String lieuNaissance;
	
	private String adresse;
	
	private String cin;
	
	private long numTel;
	
	@Embedded
	private Compte compte;
	@Embedded
	private CNSS cnss;
	
	@Embedded
	private Person personToContact;

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		compte = compte;
	}

	public CNSS getCnss() {
		return cnss;
	}

	public void setCnss(CNSS cnss) {
		this.cnss = cnss;
	}

	public Person getPersonToContact() {
		return personToContact;
	}

	public void setPersonToContact(Person personToContact) {
		this.personToContact = personToContact;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public List<Habillement> getHabillements() {
		return habillements;
	}

	public void setHabillements(List<Habillement> habillements) {
		this.habillements = habillements;
	}

	public List<ModaliteTravail> getModaliteTravails() {
		return modaliteTravails;
	}

	public void setModaliteTravails(List<ModaliteTravail> modaliteTravails) {
		this.modaliteTravails = modaliteTravails;
	}






	@OneToOne
	private Contrat contrat;
	
	@OneToMany
	List<Habillement> habillements;
	
	@ManyToMany
	private List<ModaliteTravail> modaliteTravails;

	
	
	public Long getId() {
		return id;
	}

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public long getNumTel() {
		return numTel;
	}

	public void setNumTel(long numTel) {
		this.numTel = numTel;
	}

	

	

	
	public Agent(String name, String lastname, Date dateNaissance, String lieuNaissance, String adresse, String cin) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.adresse = adresse;
		this.cin = cin;
	}
	



	



}
