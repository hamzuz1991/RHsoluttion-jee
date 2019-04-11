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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "t_entrep")
@EntityListeners(AuditingEntityListener.class)
public class Entreprise implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Entreprise [id_entreprise=" + id_entreprise + ", name_entrep=" + name_entrep + ", raison_social="
				+ raison_social + ", departements=" + departements + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_entreprise;
	@Column(name = "napme_entreprise")
	private String name_entrep;
	@Column(name = "raison_social")
	private String raison_social;

	@OneToMany(mappedBy = "entrprise", cascade = { CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	private List<Departement> departements;
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Employe directeur_generale;

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_entreprise() {
		return id_entreprise;
	}

	public void setId_entreprise(Long id_entreprise) {
		this.id_entreprise = id_entreprise;
	}

	public String getName_entrep() {
		return name_entrep;
	}

	public void setName_entrep(String name_entrep) {
		this.name_entrep = name_entrep;
	}

	public String getRaison_social() {
		return raison_social;
	}

	public void setRaison_social(String raison_social) {
		this.raison_social = raison_social;
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	public Entreprise(String name_entrep, String raison_social) {
		super();
		this.name_entrep = name_entrep;
		this.raison_social = raison_social;

	}

	public void adddepartement(Departement departement) {

		departement.setEntrprise(this);
		this.departements.add(departement);
	}
}
