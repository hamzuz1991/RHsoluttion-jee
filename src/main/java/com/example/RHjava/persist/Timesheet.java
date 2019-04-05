package com.example.RHjava.persist;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity 
@Table (name="t_temsheet")
@EntityListeners(AuditingEntityListener.class)
public class Timesheet implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_temshet ;
	@ManyToOne 
	private Employe employe ;
	@ManyToOne
	private Mission mission ;
@Column (name="t_datedebut")
	private Date date_debut;
@Column (name="t_datedefin")

private Date date_defin;

public Date getDate_debut() {
	return date_debut;
}
public void setDate_debut(Date date_debut) {
	this.date_debut = date_debut;
}
public Date getDate_defin() {
	return date_defin;
}
public void setDate_defin(Date date_defin) {
	this.date_defin = date_defin;
}
public Timesheet() {
	super();
	// TODO Auto-generated constructor stub
}

public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public Mission getMission() {
	return mission;
}
public void setMission(Mission mission) {
	this.mission = mission;
}
public Timesheet(Date date_debut, Date date_defin, Employe employe,Mission mission) {
	super();
	this.date_debut = date_debut;
	this.date_defin = date_defin ;
	this.employe = employe;
	this.mission =mission ;
}



}
