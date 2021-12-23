package com.zerolcamb.clases;

public class Familiar extends Persona {
    private String parentesco;

    public Familiar(String nombre, int edad, String parentesco) {
        super(nombre, edad);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "\n----------" + super.toString() + "\nParentesco: " + parentesco + "\n----------";
    }
}
