package com.example.RHjava.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.RHjava.persist.Departement;
import com.example.RHjava.persist.Employe;
import com.example.RHjava.persist.Entreprise;
import com.example.RHjava.repostry.Departementrepostery;
import com.example.RHjava.repostry.Employerrepostry;
import com.example.RHjava.repostry.Entrepriserepostry;

@Service
public class DepartementDAo implements DepartementDaoservices {
	
	@Autowired
	Departementrepostery departementrepostery;
	@Autowired
    Employerrepostry emprep ;
	@Autowired
    Entrepriserepostry emtrep ;
	@Override
	public long ajouterdepartement(Departement departement) {
		 	departementrepostery.save(departement);
		 	return departement.getId_dep() ;
	}

	
	
	

	

	@Override
	public void deletedepartement(Long iddep) {
		departementrepostery.deleteById(iddep);

	}





	@Override
	public Departement finddep(Long iddep) {
		// TODO Auto-generated method stub
		return departementrepostery.findByiddep(iddep);
	}





	@Override
	public ResponseEntity<Object>  addChef(Long idemp, Long iddep) {
		Optional<Departement> departement =	departementrepostery.findById(iddep);
		Optional<Employe> employe = emprep.findById(idemp);
		if((!departement.isPresent())||(!employe.isPresent())) {
			return ResponseEntity.notFound().build();
		}
		
				departement.get().setChef_departement(employe.get());
		departementrepostery.save(departement.get());
		employe.get().setChef_dep(departement.get());
		emprep.save(employe.get());
		return ResponseEntity.noContent().build();
	}







	@Override
	public List<Departement> getalldepartement(long identrep) {
		return departementrepostery.findByidentrep(identrep);
		
	}







	@Override
	public ResponseEntity<Object> addentrep(Long identrep, Long iddep) {
		Optional<Departement> departement =	departementrepostery.findById(iddep);
		Optional<Entreprise> entrep = emtrep.findById(identrep);
		if((!departement.isPresent())||(!entrep.isPresent())) {
			return ResponseEntity.notFound().build();
		}
		
				departement.get().setEntrprise(entrep.get());
		departementrepostery.save(departement.get());
		entrep.get().adddepartement(departement.get());;
		emtrep.save(entrep.get());
		return ResponseEntity.noContent().build();
	
	}





	
 




	
}


