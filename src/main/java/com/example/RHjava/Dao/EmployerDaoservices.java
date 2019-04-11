package com.example.RHjava.Dao;

import java.util.List;
import java.util.Optional;

import com.example.RHjava.persist.Employe;

public interface EmployerDaoservices {
	public Employe  ajouterEmployer(Employe employe);
	
	public Employe findbyeidemployer(Long idemp) ;
	
	public List<Employe> findallemplyer() ;
}
