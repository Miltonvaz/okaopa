package com.milton.concesionaria.models;

import java.util.UUID;

public class Vendedor {
    private String nombre;
    private String apellido;
    private UUID uuid = UUID.randomUUID();
   private Gestion gestion = new Gestion();

    public Vendedor() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
