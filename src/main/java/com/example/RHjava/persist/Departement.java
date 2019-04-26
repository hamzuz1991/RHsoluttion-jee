package com.example.RHjava.persist;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

@Entity
@Table(name = "t_departement")
@EntityListeners(AuditingEntityListener.class)
public class Departement implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_dep;

	@Column(name = "t_nom_dep")
	private String nom_dep;
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Employe chef_departement;
	
	@ManyToOne
	@JsonIgnore
	private Entreprise entrprise;
	@ManyToOne
	private Employe chef_de_projet;
	@ManyToMany
	List<Employe> employes;
	@OneToMany(mappedBy = "departement")
	List<Mission> missions;

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement(String nom_dep) {
		super();
		this.nom_dep = nom_dep;
	}

	public void setId_dep(Long id_dep) {
		this.id_dep = id_dep;
	}

	@Override
	public String toString() {
		return "Departement [id_dep=" + id_dep + ", nom_dep=" + nom_dep + ", entrprise=" + entrprise + "]";
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

	public Long getId_dep() {
		return id_dep;
	}

	public Employe getChef_departement() {
		return chef_departement;
	}

	public void setChef_departement(Employe chef_departement) {
		this.chef_departement = chef_departement;
	}

	public void addmission(Mission mission) {
		mission.setDepartement(this);
		this.missions.add(mission);
	}



public Employe getChef_de_projet() {
	return chef_de_projet;
}

public void setChef_de_projet(Employe chef_de_projet) {
	this.chef_de_projet = chef_de_projet;
}
}
