// p34_NumeroMayor - Dado 3 números, verifica cual es el mayor

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\nDame el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Dame el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Dame el tercer número: ");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            System.out.printf("El primer número (%d) es el mayor...", num1);
        } else if (num2 > num3) {
            System.out.printf("El segundo número (%d) es el mayor...", num2);
        } else {
            System.out.printf("El tercer número (%d) es el mayor... ", num3);
        }
    }
}
