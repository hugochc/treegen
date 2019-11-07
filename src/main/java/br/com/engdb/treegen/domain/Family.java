package br.com.engdb.treegen.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Family extends Domain {
	
	private static final long serialVersionUID = 1043234550440966412L;
	
	@Column
	private String name;
	
	@OneToMany
	private Set<Person> members = new HashSet<Person>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Person> getMembers() {
		return members;
	}

	public void setMembers(Set<Person> members) {
		this.members = members;
	}
	
}
