// p33_NumerosConsecutivos - Verificar si son consecutivos

import java.util.Scanner;

public class p33_NumerosConsecutivos {
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

        if (sonConsecutivos(num1, num2, num3)) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números no son consecutivos.");
        }
    }

    public static boolean sonConsecutivos(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        return (max - min == 2) && (a != b && b != c && a != c);
    }
}
