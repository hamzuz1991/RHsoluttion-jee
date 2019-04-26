package com.example.RHjava.controlleur;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RHjava.Dao.DepartementDAo;
import com.example.RHjava.Dao.DepartementDaoservices;
import com.example.RHjava.Dao.EmployerDaoservices;
import com.example.RHjava.persist.Departement;
import com.example.RHjava.persist.Employe;
import com.example.RHjava.persist.Entreprise;

@RestController
@RequestMapping("/departement")
public class Departementcontrolleur {

	@Autowired
	DepartementDaoservices depaertemenrDao;
	@Autowired
	EmployerDaoservices entreDAo;
	
	

	@PostMapping("/ajoute")
	public Long ajouterDepartement(@Valid @RequestBody Departement departement) {
		depaertemenrDao.ajouterdepartement(departement);
		
		return departement.getId_dep();

	}

	@GetMapping("/getdep/{iddep}")
	public Departement getdep(@PathVariable(value = "iddep") long iddep) {
		return depaertemenrDao.finddep(iddep);
	}

	@GetMapping("/getalldep/{identrep}")
	public List<Departement> getalldep(@PathVariable(value = "identrep") long identrep) {
		return depaertemenrDao.getalldepartement(identrep);
	}
			
	@PutMapping("/addchef/{idemp}/{iddep}")
	public void addchefDepartement(@PathVariable(value = "idemp") Long idemp,
			@PathVariable(value = "iddep") Long iddep) {
depaertemenrDao.addChef(idemp, iddep); 
		
	}
	

	@PutMapping("/adddep/{identrep}/{iddep}")
	public void addDepartement(@PathVariable(value = "identrep") Long identrep,@PathVariable(value = "iddep") Long iddep) {
depaertemenrDao.addentrep(identrep, iddep);
	}
}
