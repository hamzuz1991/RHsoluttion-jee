package com.example.RHjava.controlleur;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RHjava.Dao.EmployerDao;
import com.example.RHjava.persist.Employe;

@RestController
@RequestMapping("/employer")
public class Employeecontrolleur {
@Autowired
	EmployerDao employerDao ;
	@PostMapping("/ajoute")
	 public Employe ajouteremployer(@Valid @RequestBody Employe employe) {
		return  employerDao.ajouterEmployer(employe);
	
	}
@GetMapping("/getemp/{idemp}")
public Employe getEmployer(@PathVariable (value ="idemp") long idemp) {
	return employerDao.findbyeidemployer(idemp);
}
}
