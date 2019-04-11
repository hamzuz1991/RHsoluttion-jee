package com.example.RHjava.Dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RHjava.persist.Employe;
import com.example.RHjava.repostry.Employerrepostry;
@Service
public class EmployerDao implements EmployerDaoservices {
@Autowired
Employerrepostry employerrepostry ;
public Employe  ajouterEmployer(Employe employe)  {
	return employerrepostry.save(employe) ;
	
}
public List<Employe> getallemEmployes() {
	return  employerrepostry.findAll();

	
}
public Employe findbyeidemployer(Long idemp) {
	return employerrepostry.findByidentemp(idemp);
	
}
public void deleteemployer(Employe employe) {
	employerrepostry.delete(employe);
}
public List<Employe> findallemplyer() {
	return employerrepostry.findAll() ;
}
}