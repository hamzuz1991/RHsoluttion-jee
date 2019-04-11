package com.example.RHjava.persist;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)

public class Autorisationdesortie extends Conger {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String raison_autorisation ;

private int nbre_heures ;

public String getRaison_autorisation() {
	return raison_autorisation;
}
public void setRaison_autorisation(String raison_autorisation) {
	this.raison_autorisation = raison_autorisation;
}
public int getNbre_heures() {
	return nbre_heures;
}
public void setNbre_heures(int nbre_heures) {
	this.nbre_heures = nbre_heures;
}
}
