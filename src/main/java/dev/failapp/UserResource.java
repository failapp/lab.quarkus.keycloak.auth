package dev.failapp;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/users")
public class UserResource {

    @GET
    @Path("/info")
    @RolesAllowed("user")
    @Produces(MediaType.TEXT_PLAIN)
    public String user() {
        return "user resource granted..";
    }

    @GET
    @Path("/open")
    @PermitAll
    @Produces(MediaType.TEXT_PLAIN)
    public String open() {
        return "public resource..";
    }


}
