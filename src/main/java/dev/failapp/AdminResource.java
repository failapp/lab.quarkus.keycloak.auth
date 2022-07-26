package dev.failapp;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/admin")
public class AdminResource {

    @GET
    @Path("/info")
    @RolesAllowed("admin")
    @Produces(MediaType.TEXT_PLAIN)
    public String user() {
        return "admin resource granted..";
    }

}
