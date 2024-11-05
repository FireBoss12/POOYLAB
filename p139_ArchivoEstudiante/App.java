package p139_ArchivoEstudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        String archivo = "estudiantes.dat";
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("-------- Procesamiento de Estudiantes --------");
            System.out.println("Capturar datos ......................... [1]");
            System.out.println("Grabar datos en el archivo ............. [2]");
            System.out.println("Leer datos en el archivo ............... [3]");
            System.out.println("Mostrar datos .......................... [4]");
            System.out.println("Calcular promedio de calificaciones .... [5]");
            System.out.println("Calcular promedio de edades ............ [6]");
            System.out.println("Contar cantidad de hombres y mujeres ... [7]");
            System.out.println("SALIR .................................. [8]");
            System.out.print("Selecciona una opción: ");
            op = obj.nextInt();
            obj.nextLine();

            switch (op) {
                case 1:
                    Procesa.capturarDatos(estudiantes);
                    break;
                case 2:
                    try {
                        if (!estudiantes.isEmpty()) {
                            Procesa.grabarDatos(archivo, estudiantes);
                            System.out.println("Datos grabados correctamente.");
                        } else {
                            System.out.println("No hay datos para grabar.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error al grabar los datos en el archivo.");
                    }
                    break;
                case 3:
                    try {
                        estudiantes = Procesa.leerDatos(archivo);
                        System.out.println("Datos cargados correctamente.");
                    } catch (Exception e) {
                        System.out.println("Error al cargar los datos del archivo.");
                    }
                    break;
                case 4:
                    if (estudiantes.isEmpty()) {
                        System.out.println("No hay datos para mostrar.");
                    } else {
                        Procesa.mostrarDatos(estudiantes);
                    }
                    break;
                case 5:
                    Procesa.calcularPromedio(estudiantes);
                    break;
                case 6:
                    Procesa.calcularPromedioEdades(estudiantes);
                    break;
                case 7:
                    Procesa.contarGenero(estudiantes);
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }
            System.out.println("\n<<Presione Enter para continuar>>");
            obj.nextLine();
        } while (op != 8);
        
        obj.close();
        System.out.println("Proceso terminado.");
    }
}

