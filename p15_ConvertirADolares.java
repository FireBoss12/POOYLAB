// p15_ConvertirADolares - Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        double pesos, dolares;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa los pesos que quieras convertir: ");
        pesos = scanner.nextDouble();

        dolares = pesos * 18.79;

        System.out.printf("Dados los %.2f pesos, convertidos a dólares son: %.3f\n", pesos, dolares);
    }
}

