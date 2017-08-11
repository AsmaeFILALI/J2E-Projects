
package com.testjerseyweb.rest;

import org.springframework.stereotype.Component;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Component
@Path("/rest")
public class HelloTest  {

        @GET
        @Path("/hello")
        public Response savePayment() {

            return Response.status(200).entity("hello").build();


    }
	
}
