package com.chemasmas.jaxrs.canciones.services;
import com.chemasmas.jaxrs.canciones.domain.Cancion;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cancion")
public interface ServiciosCanciones {
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    //@Produces({MediaType.APPLICATION_XML})
    public Response all();

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response add(Cancion cancion);

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response update(@PathParam("id") int id,Cancion cancion);

    @GET
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getById(@PathParam("id") int id);


    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response deleteById(@PathParam("id") int id);

//    @PUT
//    @Path("{id}")
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces({MediaType.APPLICATION_JSON})
//    public Response putById(int id, Cancion c);

    @GET
    @Path("buscar")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getByQuery(
            @QueryParam("titulo") String titulo
    );
}
