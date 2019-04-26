package com.example.RHjava.repostry;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.RHjava.persist.Departement;



public interface Departementrepostery extends JpaRepository<Departement,Long> {
	
	  @Query("select d from Departement d where d.id_dep = :iddep")
	  Departement findByiddep(@Param("iddep") Long iddep) ;

	  @Query("select d   from Departement d where entrprise_id_entreprise = :identrep")
	  List<Departement> findByidentrep(@Param("identrep") Long identrep) ;
}
