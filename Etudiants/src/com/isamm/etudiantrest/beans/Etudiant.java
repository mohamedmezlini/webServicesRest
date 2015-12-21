package com.isamm.etudiantrest.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Etudiant {
	private String id;
	private String name;
	private String moyenne;
	private String classe;

	public Etudiant() {

	}

	public Etudiant(String id, String name, String classe,String moyenne) {
		super();
		this.id = id;
		this.name = name;
		this.moyenne = moyenne;
		this.classe=classe;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(String moyenne) {
		this.moyenne = moyenne;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}



}