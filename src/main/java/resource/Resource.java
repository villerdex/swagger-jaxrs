package resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jdk.management.resource.ResourceContext;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

/**
 * Created by Didoy on 9/10/2017.
 */

@Api
@Path("/hello")
public class Resource {


    @GET
    @Path("/{param}")
    @ApiOperation(value = "Returns a test")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }

}
