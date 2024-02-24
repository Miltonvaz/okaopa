package com.milton.concesionaria.models;

public class Sedan extends Automovil{
    private int cantidadPuertas;

    public Sedan(String modelo, String color, int cilindros, int precio, int annio, String noMotor, int cantidadPuertas) {
        super(modelo, color, cilindros, precio, annio, noMotor);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}
