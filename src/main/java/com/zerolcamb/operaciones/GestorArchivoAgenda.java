package com.zerolcamb.operaciones;

import com.zerolcamb.clases.Agenda;

import java.io.*;

public class GestorArchivoAgenda {
    public static Agenda leerArchivo() throws IOException, ClassNotFoundException {
        FileInputStream entArch = new FileInputStream("files/agenda.dat");
        ObjectInputStream entStream = new ObjectInputStream(entArch);
        Agenda _agenda = (Agenda) entStream.readObject();
        entArch.close();
        entStream.close();
        return _agenda;
    }

    public static void actualizaArchivo(Agenda _agenda) throws IOException {
        FileOutputStream salArch = new FileOutputStream("files/agenda.dat");
        ObjectOutputStream salStream = new ObjectOutputStream(salArch);
        salStream.writeObject(_agenda);
        System.out.println("Se actualizo correctamente el archivo");
        salArch.close();
        salStream.close();

    }
}
