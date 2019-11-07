package br.com.engdb.treegen.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Person extends Domain {

	private static final long serialVersionUID = -5255901234994486505L;
	
	@Column
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Calendar birth;
	
	@ManyToOne
	private Person father;
	
	@ManyToOne
	private Person mother;
	
	@ManyToOne
	private Family family;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getBirth() {
		return birth;
	}

	public void setBirth(Calendar birth) {
		this.birth = birth;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

}
