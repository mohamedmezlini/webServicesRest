package com.isamm.etudiantrest.resources;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.isamm.etudiantrest.beans.Etudiant;
import com.isamm.etudiantrest.services.EtudiantService;

@Path("/etudiants")
public class EtudiantsResource {

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	EtudiantService etudiantService;

	public EtudiantsResource() {
		etudiantService = new EtudiantService();
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Etudiant> getEtudiants() {
		return etudiantService.getEtudiantAsList();
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Etudiant> getEtudiantsAsHtml() {
		return etudiantService.getEtudiantAsList();
	}

	// URI: /rest/etudiants/count
	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		return String.valueOf(etudiantService.getEtudiantsCount());
	}

	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void createEtudiant(@FormParam("id") String id,
			@FormParam("etudiantname") String name,
			@FormParam("etudiantmoyenne") String moyenne,
			@FormParam("etudiantclasse") String classe,
			@Context HttpServletResponse servletResponse) throws IOException {
		Etudiant etudiant = new Etudiant(id, name, classe,moyenne);
		etudiantService.createEtudiant(etudiant);
		servletResponse.sendRedirect("./etudiants/");
	}

	@Path("{etudiant}")
	public EtudiantResource getEtudiant(@PathParam("etudiant") String id) {
		return new EtudiantResource(uriInfo, request, id);
	}

}