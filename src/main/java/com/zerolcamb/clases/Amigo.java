package com.zerolcamb.clases;

public class Amigo extends Persona {
    private String apodo;

    public Amigo(String nombre, int edad, String apodo) {
        super(nombre, edad);
        this.apodo = apodo;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "\n----------" + super.toString() + "\nApodo: " + apodo + "\n----------";
    }
}
