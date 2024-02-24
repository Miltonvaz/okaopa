package com.milton.concesionaria.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Citas {
    private LocalDateTime fechaHora;
    private Cliente client;
    private  Automovil carro;
    private LocalDate date;
    private LocalTime hour;
    private ArrayList<Cliente> listaClients = new ArrayList<>();

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public Automovil getCarro() {
        return carro;
    }

    public void setCarro(Automovil carro) {
        this.carro = carro;
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
    public boolean addCliente(Cliente client) {
        return listaClients.add(client);
    }


    @Override
    public String toString() {
        return "Citas{" +
                "fechaHora=" + fechaHora +
                ", client=" + client +
                ", carro=" + carro +
                ", date=" + date +
                ", hour=" + hour +
                '}';
    }
}


