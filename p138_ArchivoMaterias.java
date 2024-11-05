import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class p138_ArchivoMaterias {

    public static void capturarMaterias(ArrayList<String> materias) {
        String materia = "";
        System.out.println("\nIntroduce una materia y presiona <ENTER> para terminar..");
        while (true) {
            materia = new Scanner(System.in).nextLine();
            if (materia.isEmpty()) break; 
            materias.add(materia);
        }
    }

    public static void mostrarMaterias(ArrayList<String> materias) {
        System.out.println("\nLas materias hasta el momento son:");
        for (String materia : materias)
            System.out.println(materia);
    }

    public static void grabarMaterias(String arch, ArrayList<String> materias) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(arch)));
        for (String materia : materias)
            writer.write(materia + "\n");
        writer.close();
    }

    public static void leerMaterias(String arch, ArrayList<String> materias) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(arch)));
        String linea;
        while ((linea = reader.readLine()) != null) {
            materias.add(linea);
        }
        reader.close();
    }

    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        ArrayList<String> materias = new ArrayList<>();
        String arch = "materias.txt";

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("-------- Procesamiento de Materias --------");
            System.out.println("Capturar materias ................... [1]");
            System.out.println("Grabar materias en el archivo ....... [2]");
            System.out.println("Leer materias desde el archivo ...... [3]");
            System.out.println("Mostrar materias .................... [4]");
            System.out.println("SALIR ............................... [5]");
            System.out.print("Selecciona una opción: ");
            op = obj.nextInt();
            obj.nextLine();

            switch (op) {
                case 1:
                    System.out.println("\nCaptura de materias ...");
                    capturarMaterias(materias);
                    break;
                case 2:
                    System.out.println("\nGrabando materias en archivo ...");
                    try {
                        grabarMaterias(arch, materias);
                        System.out.println("Las materias han sido guardadas en el archivo.");
                    } catch (IOException e) {
                        System.out.println("Error al grabar el archivo: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("\nLeyendo materias desde el archivo ...");
                    try {
                        materias.clear();
                        leerMaterias(arch, materias);
                        System.out.println("Materias leídas desde el archivo con éxito.");
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo: " + e.getMessage());
                    }
                    mostrarMaterias(materias);
                    break;
                case 4:
                    System.out.println("\nMostrando materias ...");
                    mostrarMaterias(materias);
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema ...");
                    break;
                default:
                    System.out.println("\nOpción inválida. Inténtalo nuevamente.");
                    break;
            }
            System.out.println("\n<<Presione Enter para continuar>>");
            obj.nextLine();
        } while (op != 5);

        System.out.println("\nProceso terminado.");
    } 
} 
