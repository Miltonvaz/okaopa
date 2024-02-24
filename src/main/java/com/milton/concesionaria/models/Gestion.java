package com.milton.concesionaria.models;

import java.util.ArrayList;

public class Gestion {
    private ArrayList<Venta> listaVentas = new ArrayList<>();
    private ArrayList<Citas> listasCitas = new ArrayList<>();

    public boolean addCitas(Citas citas1){
        return listasCitas.add(citas1);
    }

    public boolean addVenta(Venta ventas){
        return listaVentas.add(ventas);
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public ArrayList<Citas> getListasCitas() {
        return listasCitas;
    }

    public void setListasCitas(ArrayList<Citas> listasCitas) {
        this.listasCitas = listasCitas;
    }
}
