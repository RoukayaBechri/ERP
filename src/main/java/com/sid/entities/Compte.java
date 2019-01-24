package com.sid.entities;

import java.io.Serializable;

public class Compte implements Serializable {
	private String rib;
	private String agenceAdr;
	private String banque;
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public String getAgenceAdr() {
		return agenceAdr;
	}
	public void setAgenceAdr(String agenceAdr) {
		this.agenceAdr = agenceAdr;
	}
	public String getBanque() {
		return banque;
	}
	public void setBanque(String banque) {
		this.banque = banque;
	}
	

}
