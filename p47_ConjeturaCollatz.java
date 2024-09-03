// p47_ConjeturaCollatz - Imprime los numeros de la conjetura de Collatz

import java.util.Scanner;

public class p47_ConjeturaCollatz {
    public static void main(String[] args) {
        int n = 0;
        char resp;
        Scanner obj = new Scanner(System.in);

        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {
            System.out.println("Imprime los numeros de la conjetura de Collatz \n");
            System.out.print("Dame un numero entero: ");
            n = obj.nextInt();

            do {
                System.out.printf("%d ", n);
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = n * 3 + 1;
                }
            } while (n != 1);
            System.out.printf("%d ", n); 
            System.out.println();

            System.out.print("¿Deseas continuar (S/N)? ");
            resp = obj.next().toUpperCase().charAt(0);
        } while (resp == 'S');

        System.out.println("Gracias por utilizar el programa.");
    }
}