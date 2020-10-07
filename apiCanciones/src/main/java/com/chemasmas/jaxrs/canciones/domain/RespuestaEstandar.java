package com.chemasmas.jaxrs.canciones.domain;

import javax.json.bind.annotation.JsonbProperty;

public class RespuestaEstandar<T> {

    @JsonbProperty
    private String status;
    @JsonbProperty
    private T data;
    @JsonbProperty
    private String message;

    public RespuestaEstandar() {
    }

    public RespuestaEstandar(String status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
