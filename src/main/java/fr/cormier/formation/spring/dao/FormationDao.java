package fr.cormier.formation.spring.dao;

import java.util.List;

import fr.cormier.formation.spring.modele.Formation;

public interface FormationDao {

	String quiSuisJe();

	List<Formation> findAll();
}
