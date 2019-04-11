package com.example.RHjava.repostry;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.RHjava.persist.Employe;
import com.example.RHjava.persist.Entreprise;

public interface Employerrepostry extends JpaRepository<Employe,Long>{

	  @Query("select e from Employe e where e.id_emplye = :idemp")
	  Employe findByidentemp(@Param("idemp") Long idemp) ;
	
		
}
