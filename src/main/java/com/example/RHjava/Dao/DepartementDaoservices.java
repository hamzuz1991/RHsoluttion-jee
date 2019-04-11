package com.example.RHjava.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.expression.spel.support.ReflectivePropertyAccessor.OptimalPropertyAccessor;
import org.springframework.http.ResponseEntity;

import com.example.RHjava.persist.Departement;
import com.example.RHjava.persist.Employe;

public interface DepartementDaoservices {
public Integer ajouterdepartement(Departement departement) ;
public  Departement finddep(Long iddep );
public List<Departement> getalldepartement();
public void deletedepartement (Long iddep);
public ResponseEntity<Object> addChef (Long idemp,Long iddep);
}
