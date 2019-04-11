package com.example.RHjava.persist;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Congersanssolde extends Conger {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String raison_de_conger ;
public String getRaison_de_conger() {
	return raison_de_conger;
}
public void setRaison_de_conger(String raison_de_conger) {
	this.raison_de_conger = raison_de_conger;
}
}
