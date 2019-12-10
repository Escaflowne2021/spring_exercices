package fr.cormier.formation.spring.service;

import java.util.List;

import fr.cormier.formation.spring.modele.Formation;


public interface FormationService {

	List<Formation> findAll();
}
