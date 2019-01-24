package com.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Habillement implements Serializable {
	@Id
	@GeneratedValue
private long id;
private String name;
private int quantity;
private Date datePrise;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Date getDatePrise() {
	return datePrise;
}
public void setDatePrise(Date datePrise) {
	this.datePrise = datePrise;
}
public Habillement() {
	super();
	// TODO Auto-generated constructor stub
}


}
