// p25_EstacionesAño - Muestra la estación del año que corresponde al número introducido

import java.util.Scanner;

public class p25_EstacionesAño {
    public static void main(String[] args) {
        
        // Limpiar la consola 
        System.out.print("\033[H\033[2J");System.out.flush();
        
        System.out.println("\nDame un número entre 1 y 4 y te diré qué estación del año es ? ");
        int n = new Scanner(System.in).nextInt();

        if ( n>=1 && n<=4) {
            System.out.println("Felicidades!!, si sabes leer...");
            if(n==1) System.out.println("\nPrimavera");
            if(n==2) System.out.println("\nVerano");
            if(n==3) System.out.println("\nOtoño");
            if(n==4) System.out.println("\nInvierno");
        } else 
            System.out.println("\nEsa estación del año no existe !!!");

        System.out.println("\nVámonos al comedor ..... > .....");
    }
}
