package com.example.RHjava.Dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.stereotype.Service;

import com.example.RHjava.persist.Entreprise;
import com.example.RHjava.repostry.Entrepriserepostry;

@Service
public class EntrepriseDAO implements EntrepriseDAoservices {
	@Autowired

	Entrepriserepostry entrepriserepostry;

	public Integer ajouteentreprise(Entreprise entreprise) {

		entrepriserepostry.save(entreprise);
		return null;
	}

	@Override
	public Entreprise findentreprise(Long identrep) {
		// TODO Auto-generated method stub
		return entrepriserepostry.findByidentrep(identrep);
	}

	@Override
	public List<Entreprise> findallentreprise() {
	
		return entrepriserepostry.findAll();
	}

}