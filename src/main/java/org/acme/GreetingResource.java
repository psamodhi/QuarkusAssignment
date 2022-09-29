package org.acme;

import io.micrometer.core.annotation.Counted;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")

public class GreetingResource {

    @GET
    @Counted
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Priya";
    }
}