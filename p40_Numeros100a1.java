// p40_Numeros100a1 - Imprime numeros de n a 1, en decremento de d, usando un ciclo while

import java.util.Scanner;

public class p40_Numeros100a1 {
    public static void main(String[] args) {
       
        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Imprimiendo los números de n a 0 en decremento de 1 \n ");
        System.out.println("Desde donde deseas descender ? "); int c = new Scanner(System.in).nextInt();
        System.out.println("En decremento de             ? "); int d = new Scanner(System.in).nextInt();

        while (c >= 1) {
            System.out.printf("%d ", c);
            c = c - d;
        }

        System.out.println("\nEl ciclo ha terminado...");
        System.out.println(c);
    }
}
    
