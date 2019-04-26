package com.example.RHjava.Dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.example.RHjava.persist.Entreprise;

public interface EntrepriseDAoservices {
	public Integer ajouteentreprise(Entreprise entreprise);
	public Entreprise findentreprise(Long identrep);
	public List<Entreprise> findallentreprise();
}
