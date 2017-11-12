package com.olive.divine.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Jersey say : " + msg;
		Employee employee = new Employee();
		employee.setLocation("USA");
		employee.setName(msg);
		return Response.status(200).entity(employee).build();

	}

}
