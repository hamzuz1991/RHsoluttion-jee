package com.example.RHjava.persist;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="t_conger")

@EntityListeners(AuditingEntityListener.class)
public class Conger implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 752838961L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_conger ;
;
	@ManyToOne( cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	private Employe employe;
	
	private int nbre_de_jours ;

	private Date date_debut ;
	
	private Date date_retoure;
	
	private int confirmation ;
	
	@ManyToOne( cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	private Departement departement ;
	
	@ManyToOne( cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	private Entreprise entreprise ;
	
	public Integer getId_conger() {
		return id_conger;
	}
	public void setId_conger(Integer id_conger) {
		this.id_conger = id_conger;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public int getNbre_de_jours() {
		return nbre_de_jours;
	}
	public void setNbre_de_jours(int nbre_de_jours) {
		this.nbre_de_jours = nbre_de_jours;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_retoure() {
		return date_retoure;
	}
	public void setDate_retoure(Date date_retoure) {
		this.date_retoure = date_retoure;
	}
	public int getConfirmation() {
		return confirmation;
	}
	public void setConfirmation(int confirmation) {
		this.confirmation = confirmation;
	}
}
