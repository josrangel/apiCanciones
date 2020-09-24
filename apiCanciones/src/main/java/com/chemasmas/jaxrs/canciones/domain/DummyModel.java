package com.chemasmas.jaxrs.canciones.domain;

import javax.json.bind.annotation.JsonbNillable;

@JsonbNillable
public class DummyModel {
    private int id;
    private String nombre;

    public DummyModel(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
