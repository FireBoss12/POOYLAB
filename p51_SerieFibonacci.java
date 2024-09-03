// p51_SerieFibonacci 

import java.util.Scanner;

public class p51_SerieFibonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char resp;
        int n, a, b, i, siguiente;

        do {
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("Número de términos que desea imprimir? ");
            n = obj.nextInt();

            while (n <= 0) {
                System.out.print("Por favor, introduce un número positivo: ");
                n = obj.nextInt();
            }

            System.out.println("Los primeros " + n + " términos de la sucesión de Fibonacci son:");

            a = 0;
            b = 1;

            for ( i = 1; i <= n; i++) {
                System.out.print(a + " ");

                siguiente = a + b;
                a = b;
                b = siguiente;
            }
            System.out.println();

            System.out.print("¿Deseas continuar (S/N)? ");
            resp = obj.next().toUpperCase().charAt(0);

        } while (resp == 'S');

        System.out.println("Gracias por utilizar el programa.");
    }
}