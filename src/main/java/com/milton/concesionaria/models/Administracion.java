package com.milton.concesionaria.models;

import java.util.ArrayList;

public class Administracion {
    private ArrayList<Automovil> listaCarros = new ArrayList<>();

    private ArrayList<Vendedor> vendedors = new ArrayList<>();
    private  Gerente gerente = new Gerente();
    public boolean addCarros(Automovil auto){
        return listaCarros.add(auto);
    }
    public boolean addVendedor (Vendedor vendedor){
        return  vendedors.add(vendedor);
    }

    public boolean existeVendedor(Vendedor vendedor) {
        return existeVendedor(vendedor);
    }

    public ArrayList<Automovil> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<Automovil> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public ArrayList<Vendedor> getVendedors() {
        return vendedors;
    }

    public void setVendedors(ArrayList<Vendedor> vendedors) {
        this.vendedors = vendedors;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
