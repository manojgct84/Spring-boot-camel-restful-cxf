package com.bac.rds.cmx.process;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bac.rds.cmx.vo.Country;

@Path("/service")
public interface CountryService {
	  @POST
	  @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	  @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	  @Path("/country")
	  public String getCountry(Country country);
	  
	  @POST
	  @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	  @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	  @Path("/USA")
	  public String getUSADetails(Country country);

}
