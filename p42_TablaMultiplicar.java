// p42_TablaMultiplicar - Imprime la tabla de multiplicar de t hasta n

import java.util.Scanner;

public class p42_TablaMultiplicar {
    public static void main(String[] args) {
        
        int t, c, n;
        Scanner obj = new Scanner(System.in);

        // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();
        
        System.out.println("Imprime la tabla de multiplicar \n");
        System.out.println("Que tabla quieres ? "); t = obj.nextInt();
        System.out.println("Hasta donde       ? "); n = obj.nextInt();

        //t = 1;
        c = 1;

        while (c <= n) {
            System.out.printf("%d x %d = %d \n", t, c, t*c);
            c++;
        }
        System.out.println("\nProceso terminado...");
    }
}
