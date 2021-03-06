package fr.cormier.formation.spring.service;

import java.util.List;

import fr.cormier.formation.spring.dao.FormationDao;
import fr.cormier.formation.spring.modele.Formation;

public class FormationServiceImpl implements FormationService {

	private FormationDao formationDao;
	private String etablissement;

	public FormationServiceImpl() {
		System.out.println("FormationServiceImpl : constructeur par d�faut");
	}

	public FormationServiceImpl(final FormationDao formationDao, final String etablissement) {
		super();
		this.formationDao = formationDao;
		this.etablissement = etablissement;
		System.out.println("FormationServiceImpl : constructeur avec arguments");
	}

	public void setFormationDao(final FormationDao formationDao) {
		this.formationDao = formationDao;
		System.out.println("FormationServiceImpl :le setter de formationDao");
	}

	public void setEtablissement(final String etablissement) {
		this.etablissement = etablissement;
		System.out.println("FormationServiceImpl :le setter de etablissement");

	}

	@Override
	public List<Formation> findAll() {
		return formationDao.findAll();
	}
}
