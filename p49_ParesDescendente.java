// p49_ParesDescendente

import java.util.Scanner;

public class p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char resp;
        int suma, contador;
        double promedio;

        do {
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Imprimiendo los números pares desde 100 hasta n");
            System.out.print("Introduce el valor de n: ");
            int n = obj.nextInt();

            suma = 0;
            contador = 0;

            System.out.printf("Números pares desde 100 hasta %d son:\n", n);
            for (int i = 100; i >= n; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    suma += i;
                    contador++;
                }

            }

                promedio = (contador > 0) ? (double) suma / contador : 0;

            System.out.println("\nLa suma de los números impares es: " + suma);
            System.out.println("El promedio de los números impares es: " + promedio);

            System.out.print("¿Deseas continuar (S/N)? ");
            resp = obj.next().toUpperCase().charAt(0);

        } while (resp == 'S');

        System.out.println("Gracias por utilizar el programa.");
    }
}
