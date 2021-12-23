package com.zerolcamb.principal;

import com.zerolcamb.clases.Agenda;
import com.zerolcamb.operaciones.GestorArchivoAgenda;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /* Se inicializa un Scanner para ingresar datos*/
        Scanner sc = new Scanner(System.in);
        /* Se inicializa una agenda*/
        Agenda agenda = null;
        try {
            /* Se obtiene la agenda desde el archivo*/
            agenda = GestorArchivoAgenda.leerArchivo();
            System.out.println("Se ha leido tu agenda correctamente" +
                    "\nEstos son los datos que tiene");
            System.out.println(agenda);
        } catch (IOException e) {
            /* Si la agenda no existe se crea una*/
            System.out.println("Se creo el archivo Agenda.dat correctamente");
            agenda = new Agenda();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

        try {
            int opc = 0;
            while (opc != 3) {
                System.out.println("¿Qué es lo que quieres hacer?"
                        + "\n1.- Añadir un contacto"
                        + "\n2.- ver la agenda"
                        + "\n3.- Salir");
                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        agenda.addPersona();
                        break;
                    case 2:
                        System.out.println("La agenda tiene los siguientes datos");
                        System.out.println(agenda);
                        break;
                    case 3:
                        System.out.println("¡Gracias por usar este programa!");
                        break;
                    default:
                        System.out.println("Opción no definida");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
