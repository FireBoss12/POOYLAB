// p44_ParesAscendente - Imprime numeros pares desde 2 hasta n, repite el proceso varias veces

import java.util.Scanner;

public class p44_ParesAscendente {
    public static void main(String[] args) {
        
        char resp;
        int n, c, s;

        Scanner obj = new Scanner(System.in);

        do { 
            // Limpiar la consola
            System.out.print("\033[H\033[2J"); System.out.flush();

            c = 2; n = s = 0;
            System.out.println("Imprime pares de forma ascendente de 2 hasta n\n");
            System.out.println("Hasta donde deseas los pares ? "); n = obj.nextInt();

            while (c <= n) {
                System.out.printf("%d ", c);
                s += c;
                c += 2; 
            }
            System.out.printf("\nLa suma de los pares hasta %d es %d", n, s);

            System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
        } while(resp != 'N');
        System.out.println("El programa ha terminado...");
    }
}
