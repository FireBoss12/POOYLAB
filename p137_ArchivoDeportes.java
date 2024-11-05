import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class p137_ArchivoDeportes {
    public static void main(String[] args) {
        String[] deportes = {"Futbol, Beisbol, Ciclismo, Atletismo, Natacion, Motociclismo"};
        File arch = new File("deportes.txt");

        System.out.print("\033[H\033[2J");
        if (! arch.exists()) {
            System.out.println("El archivo no existe, lo estamos creando...");
            try {
                BufferedWriter fdeportes = new BufferedWriter(new FileWriter(arch));
                for (String deporte : deportes) {
                    fdeportes.write(deporte + "\n");
                }
                fdeportes.close();
                System.out.println("El archivo se ha creado con exito!");
            } catch (Exception e) {
                System.out.println("Hubo un error al intentar manipular el archivo..." + e.getMessage());
             }
        }
    }
}