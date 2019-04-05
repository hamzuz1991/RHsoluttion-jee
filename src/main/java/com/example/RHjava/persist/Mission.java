package com.example.RHjava.persist;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
 @Table(name="t_miss")
@EntityListeners(AuditingEntityListener.class)
public class Mission  implements Serializable  {

/**
	 * 
	 */
	private static final long serialVersionUID = 165498498798465156L;

 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private Integer id_mis ;

 @Column(name="descp_miss") 
 private String description ;
 
 @Column (name="titre_miss")
 private String titre_miss;

@OneToMany(mappedBy="mission")
private List<Timesheet> timesheets ;

@ManyToOne
private Departement departement ;




public Integer getId_mis() {
	return id_mis;
}
public void setId_mis(Integer id_mis) {
	this.id_mis = id_mis;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getTitre_miss() {
	return titre_miss;
}
public void setTitre_miss(String titre_miss) {
	this.titre_miss = titre_miss;
}
public Departement getDepartement() {
	return departement;
}
public void setDepartement(Departement departement) {
	this.departement = departement;
}
public Mission() {
	super();
	// TODO Auto-generated constructor stub
}
public Mission(String description, String titre_miss) {
	super();
	this.description = description;
	this.titre_miss = titre_miss;
}

}
