package org.proitec.legacy.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/basic")
public class BasicAuth {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/admin")
    public String admin() {
        return "Hello Admin";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/user")
    public String user() {
        return "Hello User";
    }
}