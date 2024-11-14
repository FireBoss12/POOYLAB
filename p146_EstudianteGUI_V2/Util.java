package p146_EstudianteGUI_V2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList <Estudiante> inicializarDatos() {
        ArrayList <Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("Juan Perez", 22, 34.5, "jperez@gmail.com"));
        datos.add(new Estudiante("Maria Jimenez", 18, 22.5, "mjimenez@gmail.com"));
        datos.add(new Estudiante("Carlos Fuentes", 30, 45, "cfuentes@msn.com"));
        return datos;
    }

    public static void grabarDatos(String archivo, ArrayList <Estudiante> datos) throws IOException {
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }

    public static ArrayList <Estudiante> leerDatos (String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Estudiante> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream (new FileInputStream(archivo));
        datos = (ArrayList <Estudiante>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
}