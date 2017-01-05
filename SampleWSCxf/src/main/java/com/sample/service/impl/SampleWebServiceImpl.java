package com.sample.service.impl;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.sample.generated.Person;
import com.sample.service.SampleWebService;

@Path("/")
@WebService(endpointInterface = "com.sample.service.SampleWebService")
public class SampleWebServiceImpl implements SampleWebService {
	
	 
	@GET
	@Path("details/")
	@Produces({"application/json"})
	//@Consumes({"application/xml","application/json","application/x-www-form-urlencoded"})
	@Override
	public Person getDataFromWebService() {
		
		Person a = new Person();
		a.setAge(1);
		a.setDescription("Description from Server!");
		a.setName("Name from Server");
		return a;
	}
	@GET
	@Path("detailsName/")
	@Produces("text/plain")
	@Override
		public String getDataFromWebServiceVipin() {
		System.out.println("Hello vipin");
			return "HelloVipin";
		}
}

