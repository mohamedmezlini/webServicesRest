package com.isamm.etudiantrest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

import com.isamm.etudiantrest.beans.Etudiant;
import com.isamm.etudiantrest.services.EtudiantService;

public class EtudiantResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	String id;

	EtudiantService etudiantService;

	public EtudiantResource(UriInfo uriInfo, Request request, String id) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.id = id;
		etudiantService = new EtudiantService();
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Etudiant getEtudiant() {
		Etudiant etudiant = etudiantService.getEtudiant(id);
		return etudiant;
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public Etudiant getEtudiantAsHtml() {
		Etudiant etudiant = etudiantService.getEtudiant(id);
		return etudiant;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response putEtudiant(JAXBElement<Etudiant> etudiantElement) {
		Etudiant etudiant = etudiantElement.getValue();
		Response response;
		if (etudiantService.getEtudiants().containsKey(etudiant.getId())) {
			response = Response.noContent().build();
		} else {
			response = Response.created(uriInfo.getAbsolutePath()).build();
		}
		etudiantService.createEtudiant(etudiant);
		return response;
	}

	@DELETE
	public void deleteEtudiant() {
		etudiantService.deleteEtudiant(id);
	}

}