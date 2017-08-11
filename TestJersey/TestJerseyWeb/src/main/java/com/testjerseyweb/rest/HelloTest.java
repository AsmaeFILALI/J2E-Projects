
package com.testjerseyweb.rest;

import com.testjerseyweb.core.InfoCore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Component
@Path("/rest")
public class HelloTest  {

    @Autowired
    @Qualifier("infoCore")
    InfoCore infoCore;

        @GET
        @Path("/hello")
        public Response savePayment() {

            return Response.status(200).entity(infoCore.getInfo()).build();


    }
	
}
