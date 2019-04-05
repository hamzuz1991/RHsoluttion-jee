package com.example.RHjava.persist;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name="raison_conger")
	private String raison ;
	@OneToOne( cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	private Employe employe;
	
}
