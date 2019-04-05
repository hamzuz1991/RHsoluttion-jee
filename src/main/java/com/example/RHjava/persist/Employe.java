package com.example.RHjava.persist;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name="t_employe")
@EntityListeners(AuditingEntityListener.class)
public class Employe implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Integer id_emplye ;
	
	@Column (name = "nom")
	private String nom_employe ;
	
	@Column (name="prenom_emplye")
	private String prenom ;
	
	@Column (name ="email")
	private String email ;

	@Column (name ="etat")
	private int etat;
	
	@Column (name ="role")
	private String role ;
	
	@OneToOne( cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	private Cantrat cantrat;
	
	@ManyToMany(mappedBy="employes" , cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Departement>  departements ;
	
	@OneToMany(mappedBy="employe" , cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Timesheet> timesheets ;
	
	public Integer getId_emplye() {
		return id_emplye;
	}
	public void setId_emplye(Integer id_emplye) {
		this.id_emplye = id_emplye;
	}
	public String getNom_employe() {
		return nom_employe;
	}
	public void setNom_employe(String nom_employe) {
		this.nom_employe = nom_employe;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int isEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}

		
public Employe(String nom_employe, String prenom, String email, int etat, String  role) {
	super();
	this.nom_employe = nom_employe;
	this.prenom = prenom;
	this.email = email;
	this.etat = etat;
	this.role = role;
}
public Employe() {
	super();
	// TODO Auto-generated constructor stub
}	
public Cantrat getCantrat() {
	return cantrat;
}
public void setCantrat(Cantrat cantrat) {
	this.cantrat = cantrat;
}

public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public void adddepartement(Departement departement ,Employe employe) {
	departements.add(departement);
	departement.employes.add(this);
}
}
