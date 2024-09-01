// p45_ParesDescendente - Imprime numeros impares desde n hasta 1, repite el proceso varias veces

import java.util.Scanner;

public class p45_ImparesDescendente {
    public static void main(String[] args) {
        
        char resp;
        int n, c, s;

        Scanner obj = new Scanner(System.in);

        do { 
            // Limpiar la consola
            System.out.print("\033[H\033[2J"); System.out.flush();

            n = s = 0;
            System.out.println("Imprime pares de forma descendente de n hasta 1\n");
            System.out.println("Desde donde deseas empezar ? "); n = obj.nextInt();
            if (n % 2 == 0) n++; 
            c = ( n%2==0 ? ++n : n);
            while (c >= 1) {
                System.out.printf("%d ", c);
                s += c;
                c -= 2; 
            }
            System.out.printf("\nLa suma de los impares hasta %d es %d", n, s);

            System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
        } while(resp != 'N');
        System.out.println("El programa ha terminado...");
    }
}
