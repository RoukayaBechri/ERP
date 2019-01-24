package com.sid.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TravailleAPk implements Serializable{
	private long idAgent;
	private long idSite;
	
	public long getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(long idAgent) {
		this.idAgent = idAgent;
	}
	public long getIdSite() {
		return idSite;
	}
	public void setIdSite(long idSite) {
		this.idSite = idSite;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idAgent ^ (idAgent >>> 32));
		result = prime * result + (int) (idSite ^ (idSite >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravailleAPk other = (TravailleAPk) obj;
		if (idAgent != other.idAgent)
			return false;
		if (idSite != other.idSite)
			return false;
		return true;
	}
	

}
