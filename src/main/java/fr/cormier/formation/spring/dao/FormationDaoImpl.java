package fr.cormier.formation.spring.dao;

import java.util.ArrayList;
import java.util.List;

import fr.cormier.formation.spring.modele.Formation;
import fr.cormier.formation.spring.modele.Formation;

public class FormationDaoImpl implements FormationDao {


	public FormationDaoImpl() {
		System.out.println("FormationDaoImpl : constructeur par d�faut ");

	}

	@Override
	public String quiSuisJe() {
		return " je suis une impl�mentation de FormationDao ";
	}

	@Override
	public List<Formation> findAll() {
		// on va ex�cuter une requ�te pour r�cup�rer la liste des formations en
		// BD
		Formation formation1 = new Formation(1L, "Spring : Etape par �tape pour devenir professionnel",
				"un descriptif");
		Formation formation2 = new Formation(2L, "Hibernate : Etape par �tape pour devenir professionnel",
				"un descriptif");
		Formation formation3 = new Formation(3L, "JPA : Etape par �tape pour devenir professionnel", "un descriptif");
		List<Formation> formations = new ArrayList<>();
		formations.add(formation1);
		formations.add(formation2);
		formations.add(formation3);
		return formations;
	}

}
