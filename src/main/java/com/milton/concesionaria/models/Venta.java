package com.milton.concesionaria.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;

public class Venta {
    private UUID ventas = UUID.randomUUID();
    private int costo;
    private Cliente clients = new Cliente();
    private LocalDate date;
    private LocalTime hour;

    private ArrayList<Automovil> ventaCar = new ArrayList<>();

    public Venta() {
    }

    public UUID getVentas() {
        return ventas;
    }

    public void setVentas(UUID ventas) {
        this.ventas = ventas;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Cliente getClients() {
        return clients;
    }

    public void setClients(Cliente clients) {
        this.clients = clients;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public boolean addCarVendido(Automovil car){
        return addCarVendido(car);
    }
}
