package com.example.RHjava.persist;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Mission_externe extends Mission  implements Serializable
{ 
	


/**
	 * 
	 */
	private static final long serialVersionUID = 8748794894191L;
@Column (name = "t_taux")
private int taux;
@Column (name = "t_facture")
private String emailfact ;

public int getTaux() {
	return taux;
}
public void setTaux(int taux) {
	this.taux = taux;
}
public String getEmailfact() {
	return emailfact;
}
public void setEmailfact(String emailfact) {
	this.emailfact = emailfact;
}
public Mission_externe() {
	super();
	// TODO Auto-generated constructor stub
}
public Mission_externe(String description, String titre_miss, int taux, String emailfact) {
	super(description, titre_miss);
	this.taux = taux;
	this.emailfact = emailfact;
}














}
