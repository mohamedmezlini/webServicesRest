package com.isamm.etudiantrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.isamm.etudiantrest.beans.Etudiant;
import com.isamm.etudiantrest.dao.EtudiantDao;

public class EtudiantService {

	EtudiantDao etudiantDao;

	public EtudiantService() {
		etudiantDao = EtudiantDao.instance;
	}

	public void createEtudiant(Etudiant etudiant) {
		etudiantDao.getEtudiants().put(etudiant.getId(), etudiant);
	}

	public Etudiant getEtudiant(String id) {
		return etudiantDao.getEtudiants().get(id);
	}

	public Map<String, Etudiant> getEtudiants() {
		return etudiantDao.getEtudiants();
	}

	public List<Etudiant> getEtudiantAsList() {
		List<Etudiant> etudiantList = new ArrayList<Etudiant>();
		etudiantList.addAll(etudiantDao.getEtudiants().values());
		return etudiantList;
	}

	public int getEtudiantsCount() {
		return etudiantDao.getEtudiants().size();
	}

	public void deleteEtudiant(String id) {
		etudiantDao.getEtudiants().remove(id);
	}

}
