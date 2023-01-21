package com.pruebakomet.mvcpruebakomet.models;

import com.google.gson.Gson;

public class Response {

    private String mensaje;
    private Integer estado;

    public Response(String mensaje, Integer estado) {
        this.mensaje = mensaje;
        this.estado = estado;
    }


    @Override


    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
