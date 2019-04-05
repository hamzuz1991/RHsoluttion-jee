package com.example.RHjava.persist;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="t_cantrat")

@EntityListeners(AuditingEntityListener.class)
public class Cantrat implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private  Integer refrence ;

@Column(name="t_typecontrat")
private String tupecontrat;

@Temporal (TemporalType.DATE)
private Date datedebut;

@OneToOne 
private Employe employe ;

@Column (name="salaire")
private int salaire;

public Cantrat(String tupecontrat, Date datedebut, int salaire) {
	super();
	this.tupecontrat = tupecontrat;
	this.datedebut = datedebut;
	this.salaire = salaire;
}

public Cantrat() {
	super();
	// TODO Auto-generated constructor stub
}


public Integer getRefrence() {
	return refrence;
}
public void setRefrence(Integer refrence) {
	this.refrence = refrence;
}
public String getTupecontrat() {
	return tupecontrat;
}
public void setTupecontrat(String tupecontrat) {
	this.tupecontrat = tupecontrat;
}
public Date getDatedebut() {
	return datedebut;
}
public void setDatedebut(Date datedebut) {
	this.datedebut = datedebut;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public int getSalaire() {
	return salaire;
}
public void setSalaire(int salaire) {
	this.salaire = salaire;
}
public void ajouteemplyer(Employe employe , Cantrat cantrat) {
	employe.setCantrat(this);
	cantrat.setEmploye(employe);
}
}
