package com.example.RHjava.repostry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.RHjava.persist.Entreprise;

public interface Entrepriserepostry extends JpaRepository<Entreprise,Long>{
	  @Query (" select e from Entreprise e where e.id_entreprise = :identrep")
	  Entreprise findByidentrep(@Param("identrep") Long identrep) ;
	 
}
