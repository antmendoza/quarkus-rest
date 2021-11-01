package org.my.group;

import org.eclipse.microprofile.openapi.annotations.Operation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class MyResource {

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(operationId = "sayHello")
    public HelloResponse sayHello(@PathParam("name") String name) {
        return new HelloResponse(name);
    }


    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(operationId = "hello")
    public HelloResponse hello() {
        return new HelloResponse("");
    }

}
