package p136_Archivos5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {
    public static void capturarDatos(ArrayList<Persona> datos) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce los datos de una Persona (nombre vacio para terminar)");
        while (true) {
            Persona persona = new Persona();
            System.out.println("Datos de la persona >");
            System.out.println("Nombre : ");  persona.setNombre(obj.nextLine());
            if (persona.getNombre().isEmpty()) break;
            System.out.println("Edad   : ");  persona.setEdad(obj.nextInt());
            System.out.println("Peso   : ");  persona.setPeso(obj.nextFloat()); obj.nextLine();
            System.out.println("Correo : ");  persona.setCorreo(obj.nextLine());
            datos.add(persona);
        }
    }

    public static void mostrarDatos(ArrayList<Persona> datos) {
        System.out.println("\nLos datos hasta el momento son :");
        for (Persona persona : datos) {
            System.out.println(persona);
        }
    }

public static void grabarDatos(String archivo, ArrayList<Persona> datos) throws IOException {
        ObjectOutputStream fdatos = new ObjectOutputStream (new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }

    public static ArrayList<Persona> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Persona> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo));
        datos = (ArrayList<Persona>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
}