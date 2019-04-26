package com.example.RHjava.controlleur;



import java.util.List;
import java.util.Set;

import javax.persistence.Query;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RHjava.Dao.DepartementDaoservices;
import com.example.RHjava.Dao.EntrepriseDAoservices;
import com.example.RHjava.persist.Departement;
import com.example.RHjava.persist.Entreprise;

@RestController
@RequestMapping("/entreprise")
public class Entreprisecontrolleure {
	@Autowired
	EntrepriseDAoservices entDao ;
	@Autowired
DepartementDaoservices depdao;

	@PostMapping("/ajoute")
	public Long ajouter(@Valid @RequestBody Entreprise entreprise) {
		entDao.ajouteentreprise(entreprise);
		return entreprise.getId_entreprise();
	}

	@GetMapping("/getentreprise/{identrep}")
	public Entreprise getentrep(@PathVariable (value="identrep") Long identrep) {
		
		return entDao.findentreprise(identrep);
	}
	
	@GetMapping("/getallentreprise")
	public List<Entreprise> getall() {
		
		return entDao.findallentreprise();
	}
	
}
