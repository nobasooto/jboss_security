package com.kec.rest.RestMessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/message")
public class MessageRestService {

    @GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg)
    {
		String result = "Restful example : " + msg;
		return Response.status(200).entity(result).build();
    }

    @GET
	@Path("/time")
	public Response printTime()
    {
		String result = new Date().toString();
		return Response.status(200).entity(result).build();
    }
}
