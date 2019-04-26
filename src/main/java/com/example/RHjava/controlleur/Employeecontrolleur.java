package com.example.RHjava.controlleur;

import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.example.RHjava.Dao.EmployerDao;

import com.example.RHjava.persist.Employe;
import com.example.RHjava.persist.Entreprise;
import com.example.RHjava.persist.Role;

@RestController
@RequestMapping("/employer")
public class Employeecontrolleur {

	@Autowired
	EmployerDao employerDao;
	
	@PostMapping("/ajoutephoto/{idemp}")
	public Employe ajouteremployer(@PathVariable(value = "idemp") long idemp,@RequestParam MultipartFile file) throws IOException  {
		
		Employe employe2= employerDao.findbyeidemployer(idemp);
		employe2.setPhoto(file.getBytes());
		return employe2;

	}
	@PostMapping("/ajoute")
	public Employe ajouteremployer(@Valid @RequestBody Employe employe){
		
		Employe employe2= employerDao.ajouterEmployer(employe);
		
		return employe2;

	}

	@GetMapping("/getemp/{idemp}")
	public Employe getEmployer(@PathVariable(value = "idemp") long idemp) {
		return employerDao.findbyeidemployer(idemp);
	}

	
}
