// p10_HipotenusaTriangulo - Calcular la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        int lonL1, lonL2;
        double hipo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el lado 1: ");
        lonL1 = scanner.nextInt();
        System.out.print("Ingresa el lado 2: ");
        lonL2 = scanner.nextInt();

        hipo = Math.sqrt(lonL1 * lonL1 + lonL2 * lonL2);

        System.out.println("La hipotenusa del triángulo dado es: " + hipo);
    }
}
