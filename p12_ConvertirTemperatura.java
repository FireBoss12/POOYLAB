// p12_ConvertirTemperatura - Convertir una temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa los grados fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println("Los " + fahrenheit + " grados fahrenheit a celsius son: " + celsius);
    }
}
