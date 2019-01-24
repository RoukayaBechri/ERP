package com.sid.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Person implements Serializable {
	private String namePerson;
	private Long tel;
	private String email;
	public String getNamePerson() {
		return namePerson;
	}
	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
