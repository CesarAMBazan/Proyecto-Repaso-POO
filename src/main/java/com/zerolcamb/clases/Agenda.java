package com.zerolcamb.clases;

import com.zerolcamb.operaciones.GestorArchivoAgenda;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda implements Serializable {
    private ArrayList<Persona> agenda;

    public Agenda() {
        agenda = new ArrayList<>();
    }

    public Agenda(ArrayList<Persona> agenda) {
        this.agenda = agenda;
    }

    public ArrayList<Persona> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Persona> agenda) {
        this.agenda = agenda;
    }

    public void addPersona() throws IOException {
        int opc, edad;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué tipo de contacto quieres añadir?" +
                "\n1.-Amigo" +
                "\n2.-Familiar");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Dame su nombre: ");
                nombre = sc.next();
                System.out.println("Dame su edad: ");
                edad = sc.nextInt();
                System.out.println("Dame su apodo: ");
                String apodo = sc.next();
                Amigo _amigo = new Amigo(nombre, edad, apodo);
                agenda.add(_amigo);
                GestorArchivoAgenda.actualizaArchivo(this);
                break;
            case 2:
                System.out.println("Dame su nombre: ");
                nombre = sc.next();
                System.out.println("Dame su edad: ");
                edad = sc.nextInt();
                System.out.println("Dame su parentesco: ");
                String parentesco = sc.next();
                Familiar _familiar = new Familiar(nombre, edad, parentesco);
                agenda.add(_familiar);
                GestorArchivoAgenda.actualizaArchivo(this);
                break;
            default:
                System.out.println("Opcion no valida, regresando...\n\n");
        }
    }


    @Override

    public String toString() {
        return "" + agenda;
    }
}
