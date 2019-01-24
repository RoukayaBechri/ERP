package com.sid.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Stock {
	@Id 
	@GeneratedValue
	private long id;
	private float quantity;
	
	@OneToMany
	private List<Habillement> habillements;
	

}
