package com.milton.concesionaria.models;

public class Camioneta extends Automovil{
    private boolean todoTerreno;
    private int capacidadCarga;

    public Camioneta(String modelo, String color, int cilindros, int precio, int annio, String noMotor, boolean todoTerreno, int capacidadCarga) {
        super(modelo, color, cilindros, precio, annio, noMotor);
        this.todoTerreno = todoTerreno;
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isTodoTerreno() {
        return todoTerreno;
    }

    public void setTodoTerreno(boolean todoTerreno) {
        this.todoTerreno = todoTerreno;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}