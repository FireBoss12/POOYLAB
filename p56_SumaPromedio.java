// p56_SumaPromedio

import java.util.Scanner;

public class p56_SumaPromedio {
    public static void main(String[] args) {
        int n;
        float cal, suma, prom;
        char resp;
        Scanner obj = new Scanner(System.in);
        
        do{
            // Limpiar la consola
                System.out.print("\033[H\033[2J");
                System.out.flush();
            suma = prom = 0;
            System.out.println("\nSuma y Promedio de n calificaciones: \n");
            System.out.println("Cuantas calificaciones ?"); n = obj.nextInt();
            for ( int i = 1; i <= n; i++) {
                System.out.printf("Calificacion %d ? ", i);
                cal = obj.nextFloat();
                suma += cal;
            }
            prom = suma / n;
            System.out.printf("\nSuma es %.2f y el promedio es %.2f\n\n", suma, prom);
            System.out.println("Deseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        }   while ( resp != 'N');
            System.out.println("\nProceso Terminado...");
    }
}
