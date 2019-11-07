package br.com.engdb.treegen.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Family extends Domain {
	
	private static final long serialVersionUID = 1043234550440966412L;
	
	@Column
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
