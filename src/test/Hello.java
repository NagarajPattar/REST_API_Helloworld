package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.ApplicationPath;
//import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {
	
	/*
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML() {
		String resource = "<? xml version='1.0' ?>" +
					"<xml> Welcome to xml response </xml> ";
		return resource;
	}
	*/
	/*
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJson() {
		String resource = null;
		return resource;
	}
	*/
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHtml() {
		String resource = "<h1> Hi Nags, welcome to HTML </h1>";
		return resource;
	}
	
}
