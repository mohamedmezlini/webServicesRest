package com.isamm.etudiantrest.dao;

import java.util.HashMap;
import java.util.Map;

import com.isamm.etudiantrest.beans.Etudiant;

public enum EtudiantDao {
	instance;

	private Map<String, Etudiant> etudiants = new HashMap<String, Etudiant>();

	private EtudiantDao() {

		//pumping-in some default data
		Etudiant etudiant = new Etudiant("1", "Maissa", "ing" ,"Bonjour :) ");
		etudiants.put("1", etudiant);
		etudiant = new Etudiant("2", "Chaima", "ing","Bonjour :) ");
		etudiants.put("2", etudiant);

	}

	public Map<String, Etudiant> getEtudiants() {
		return etudiants;
	}

}
