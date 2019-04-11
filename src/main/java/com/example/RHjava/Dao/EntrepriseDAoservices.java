package com.example.RHjava.Dao;

import java.util.Optional;

import com.example.RHjava.persist.Entreprise;

public interface EntrepriseDAoservices {
	public Integer ajouteentreprise(Entreprise entreprise);
	public Entreprise findentreprise(Long identrep);
}
