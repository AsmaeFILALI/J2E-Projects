
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
        public Response getHello() {

            return Response.status(200).entity(infoCore.getInfo()).build();


    }

    @GET
    @Path("/book")
    public Response getBook() {

        return Response.status(200).entity(infoCore.getBook().getId().toString()).build();


    }
	
}
