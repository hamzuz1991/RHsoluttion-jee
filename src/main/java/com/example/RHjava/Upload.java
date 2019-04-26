package com.example.RHjava;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.RHjava.Dao.EmployerDao;
import com.example.RHjava.persist.Employe;

@RestController
@RequestMapping
public class Upload {
	@Autowired
	EmployerDao employerDao;
	
	@PostMapping(value = "/file/{idemp}", headers = ("content-type=multipart/form-data"))
	public Employe ajouteremployer(@PathVariable(value = "idemp") long idemp,@RequestParam MultipartFile file) throws IOException  {
		
		Employe employe2= employerDao.findbyeidemployer(idemp);
		employe2.setPhoto(file.getBytes());
		return employe2;

	}
}
