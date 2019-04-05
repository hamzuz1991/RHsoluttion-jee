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
@Table( name="t_departement")
@EntityListeners(AuditingEntityListener.class)
public class Departement implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
	public String toString() {
		return "Departement [id_dep=" + id_dep + ", nom_dep=" + nom_dep + ", entrprise=" + entrprise + "]";
	}

@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private Integer id_dep;
 
@Column (name="t_nom_dep")
private String nom_dep;

@ManyToOne 
private Entreprise entrprise ;
@ManyToMany
List<Employe> employes ;
@OneToMany (mappedBy="departement")
List<Mission>missions;

public Departement() {
	super();
	// TODO Auto-generated constructor stub
}

public Departement(String nom_dep) {
	super();
	this.nom_dep = nom_dep;
}
public void setId_dep(Integer id_dep) {
	this.id_dep = id_dep;
}

public String getNom_dep() {
	return nom_dep;
}

public void setNom_dep(String nom_dep) {
	this.nom_dep = nom_dep;
}

public Entreprise getEntrprise() {
	return entrprise;
}

public void setEntrprise(Entreprise entrprise) {
	this.entrprise = entrprise;
}
public Integer getId_dep() {
	return id_dep;
}

public void addmission(Mission mission) {
	mission.setDepartement(this);
	this.missions.add(mission) ;
}
}
