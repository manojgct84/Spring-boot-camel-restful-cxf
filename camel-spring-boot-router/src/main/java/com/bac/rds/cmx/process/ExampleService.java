package com.bac.rds.cmx.process;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class ExampleService
{
  @GET
  @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
  @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
  @Path("/get")
  public String send(@QueryParam("text") String text)
  {
    return null;
  }
}
