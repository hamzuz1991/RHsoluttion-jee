package com.example.RHjava.repostry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.RHjava.persist.Departement;



public interface Departementrepostery extends JpaRepository<Departement,Long> {
	
	  @Query("select d from Departement d where d.id_dep = :iddep")
	  Departement findByiddep(@Param("iddep") Long iddep) ;

}
