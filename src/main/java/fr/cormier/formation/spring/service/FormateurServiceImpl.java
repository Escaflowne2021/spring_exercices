package fr.cormier.formation.spring.service;

import fr.cormier.formation.spring.dao.FormationDao;

public class FormateurServiceImpl implements FormateurService {

	private FormationDao formationDao;

	public FormateurServiceImpl() {
		System.out.println("FormateurServiceImpl : constructeur par d�faut");
	}

	public FormateurServiceImpl(final FormationDao formationDao) {
		super();
		this.formationDao = formationDao;
		System.out.println("FormateurServiceImpl : constructeur avec arguements");
	}

	public void setFormationDao(final FormationDao formationDao) {
		this.formationDao = formationDao;
		System.out.println("FormateurServiceImpl :le setter de formationDao");
	}

}
