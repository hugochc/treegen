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

}
