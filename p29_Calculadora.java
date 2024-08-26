// p29_Calculadora - Realiza operaciones matemáticas básicas sobre dos números

import java.util.Scanner;

public class p29_Calculadora {
    public static void main(String[] args) {
        double n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);

        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\nEfectuando operaciones matemáticas básicas sobre 2 números");
        System.out.print("Dame número 1: "); 
        n1 = obj.nextDouble();
        System.out.print("Dame número 2: "); 
        n2 = obj.nextDouble();
        System.out.print("Operación (+ - * / ^): "); 
        op = obj.next().charAt(0);

        switch (op) {
            case '+': 
                System.out.printf("%.2f + %.2f = %.2f%n", n1, n2, n1 + n2); 
                break;
            case '-': 
                System.out.printf("%.2f - %.2f = %.2f%n", n1, n2, n1 - n2); 
                break;
            case '*': 
                System.out.printf("%.2f * %.2f = %.2f%n", n1, n2, n1 * n2); 
                break;
            case '/': 
                if (n2 != 0) {
                    System.out.printf("%.2f / %.2f = %.2f%n", n1, n2, n1 / n2); 
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            case '^': 
                System.out.printf("%.2f ^ %.2f = %.2f%n", n1, n2, Math.pow(n1, n2)); 
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }
        System.out.println("\nYa te estás ganando tus chilaquiles...");
        obj.close();
    }
}
