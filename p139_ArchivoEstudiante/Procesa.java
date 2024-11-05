package p139_ArchivoEstudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {
    public static void capturarDatos(ArrayList<Estudiante> estudiantes) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce los datos de un Estudiante (nombre vacio para terminar)");
        while (true) {
            Estudiante estudiante = new Estudiante();
            System.out.println("Datos del Estudiante >");
            System.out.println("Nombre     : ");  estudiante.setNombre(obj.nextLine());
            if (estudiante.getNombre().isEmpty()) break;
            System.out.println("Edad       : ");  estudiante.setEdad(obj.nextInt());
            System.out.println("Promedio   : ");  estudiante.setPromedio(obj.nextFloat()); obj.nextLine();
            System.out.println("Sexo (H/M) : ");  estudiante.setSexo(obj.next().charAt(0));
            estudiantes.add(estudiante);
        }
    }

    public static void mostrarDatos(ArrayList<Estudiante> estudiantes) {
        System.out.println("\nLos datos hasta el momento son :");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

public static void grabarDatos(String archivo, ArrayList<Estudiante> estudiantes) throws IOException {
        ObjectOutputStream festudiantes = new ObjectOutputStream (new FileOutputStream(archivo));
        festudiantes.writeObject(estudiantes);
        festudiantes.close();
    }

    public static ArrayList<Estudiante> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ObjectInputStream festudiantes = new ObjectInputStream(new FileInputStream(archivo));
        estudiantes = (ArrayList<Estudiante>) festudiantes.readObject();
        festudiantes.close();
        return estudiantes;
    }

    public static void calcularPromedio(ArrayList<Estudiante> estudiantes) {
    double suma = 0;
    for (Estudiante estudiante : estudiantes) {
        suma += estudiante.getPromedio();
    }
    double promedio = estudiantes.isEmpty() ? 0 : suma / estudiantes.size();
    System.out.println("Promedio de calificaciones: " + promedio);
    }

    public static void calcularPromedioEdades(ArrayList<Estudiante> estudiantes) {
    int suma = 0;
    for (Estudiante estudiante : estudiantes) {
        suma += estudiante.getEdad();
    }
    double promedio = estudiantes.isEmpty() ? 0 : (double) suma / estudiantes.size();
    System.out.println("Promedio de edades: " + promedio);
    }

    public static void contarGenero(ArrayList<Estudiante> estudiantes) {
        int hombres = 0;
        int mujeres = 0;
        for (Estudiante estudiante : estudiantes) {
            char sexo = Character.toUpperCase(estudiante.getSexo());
            if (sexo == 'H') {
                hombres++;
            } else if (sexo == 'M') {
                mujeres++;
            }
        }
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
    }
}


