package com.chemasmas.jaxrs.canciones.services;


import com.chemasmas.jaxrs.canciones.domain.DummyModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/demo")
public class Demo {

    @GET
    public Response dummyItem() {
        return Response.ok(new  DummyModel(1,"TEST")).build();
    }
}
