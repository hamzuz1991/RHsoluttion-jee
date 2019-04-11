package com.example.RHjava.controlleur;



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
	@PutMapping("/adddep/{identrep}/{iddep}")
	public void addDepartement(@PathVariable(value = "identrep") Long identrep,@PathVariable(value = "iddep") Long iddep) {
	Departement departement =	depdao.finddep(iddep);
		Entreprise entreprise = entDao.findentreprise(identrep);
		entreprise.adddepartement(departement);
	}
}
