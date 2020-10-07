package com.chemasmas.jaxrs.canciones.services;

import com.chemasmas.jaxrs.canciones.domain.Cancion;
import com.chemasmas.jaxrs.canciones.domain.RespuestaEstandar;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;
import javax.json.bind.config.PropertyOrderStrategy;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CancionesImp implements ServiciosCanciones {
    private static HashMap<Integer,Cancion> dummyDb = new HashMap();
    private static AtomicInteger indexGenerator = new AtomicInteger();

    @Override
    public Response all() {
        JsonbConfig config = new JsonbConfig();
        config.withFormatting(true);
        config.withPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        config.withPropertyOrderStrategy(PropertyOrderStrategy.LEXICOGRAPHICAL);

        Jsonb jsonb= JsonbBuilder.create(config);
        ArrayList<Cancion> canciones =new ArrayList(dummyDb.values());
        System.out.println(canciones);
        return Response.ok(jsonb.toJson(new RespuestaEstandar<>("ok",canciones,"Lista de canciones"))).build();
    }

    @Override
    public Response add(Cancion cancion) {
        cancion.setId(indexGenerator.incrementAndGet());
        dummyDb.put(cancion.getId(),cancion);

        return Response.ok(new RespuestaEstandar<>("ok",cancion,"Se creo exitosamente")).build();
    }

    @Override
    public Response update(int id, Cancion cancion) {
        dummyDb.put(id,cancion);
        return Response.created(URI.create(""+cancion.getId())).build();
    }



    @Override
    public Response getById(int id) {
        Cancion cancion = dummyDb.get(id);
        return Response.ok(cancion).build();
    }

    @Override
    public Response deleteById(int id) {
        Cancion cancion = dummyDb.remove(id);
        return Response.ok(cancion).build();
    }

    @Override
    public Response getByQuery(String titulo) {
        return null;
    }
}
