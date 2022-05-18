//CAROLINA ETCHART - 278963
//MARIA EUGENIA MATTO - 227056
package resources;

import java.io.*;
import java.util.Formatter;

public class ArchivoGrabacion {

    private Formatter out;

    public ArchivoGrabacion(String unNombre) {
        try {
            out = new Formatter(unNombre);

        } catch (FileNotFoundException e) {
            System.out.println("error de creacion");
            System.exit(1);
        }
    }

    public ArchivoGrabacion(String unNombre, boolean ext) {
        // si ext es true, extiende el archivo
        try {
            FileWriter f = new FileWriter(unNombre, ext);
            out = new Formatter(f);

        } catch (IOException e) {
            System.out.println("error de creacion");
            System.exit(1);
        }
    }

    public void grabarLinea(String linea) {
        out.format("%s%n", linea);
    }

    public void cerrar() {
        out.close();
    }
}


