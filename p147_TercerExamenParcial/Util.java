package p147_TercerExamenParcial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {

    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        return datos; 
    }

    public static void grabarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        try (ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            fdatos.writeObject(datos);
        }
    }

    public static ArrayList<Jugador> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos = new ArrayList<>();
        try (ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo))) {
            datos = (ArrayList<Jugador>) fdatos.readObject();
        }
        return datos;
    }
    //Utilicé el try en (leerDatos y grabarDatos) para que se cierren automáticamente los flujos de entrada y salida
}
