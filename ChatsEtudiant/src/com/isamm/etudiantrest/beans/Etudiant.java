package com.isamm.etudiantrest.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Etudiant {
	private String id;
	private String name;
	private String message;
	private String classe;

	public Etudiant() {
		
	}

	public Etudiant(String id, String name, String classe,String message) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}



}