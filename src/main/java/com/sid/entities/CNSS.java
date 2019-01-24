package com.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.Nullable;
@Embeddable
public class CNSS implements Serializable{
	private String num;
	@Temporal(TemporalType.DATE)
	private Date dateAdesion;
	@Nullable
	private int mantant;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Date getDateAdesion() {
		return dateAdesion;
	}
	public void setDateAdesion(Date dateAdesion) {
		this.dateAdesion = dateAdesion;
	}
	public int getMantant() {
		return mantant;
	}
	public void setMantant(int mantant) {
		this.mantant = mantant;
	}
	

}
