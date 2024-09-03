// p50_ConversionTemperaturas 

import java.util.Scanner;

public class p50_ConvertirTemperaturas {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char resp;
        int temperaturaInicial, temperaturaFinal;
        double fahrenheit;

        do {
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("Introduce la temperatura inicial en grados Celsius: ");
            temperaturaInicial = obj.nextInt();
            System.out.print("Introduce la temperatura final en grados Celsius: ");
            temperaturaFinal = obj.nextInt();

            while (temperaturaFinal < temperaturaInicial) {
                System.out.println("La temperatura final no puede ser menor que la inicial. Tas menso o q");
                System.out.print("Introduce la temperatura inicial en grados Celsius: ");
                temperaturaInicial = obj.nextInt();
                System.out.print("Introduce la temperatura final en grados Celsius: ");
                temperaturaFinal = obj.nextInt();
            }

            System.out.println("------------------------------------");
            System.out.println("Centígrados\tFahrenheit");
            System.out.println("------------------------------------");

            for (int i = temperaturaInicial; i <= temperaturaFinal; i++) {
                fahrenheit = (i * 9/5) + 32;
                System.out.printf("    %d\t\t   %.1f\n", i, fahrenheit);
            }
            System.out.println("------------------------------------");

            System.out.print("¿Deseas continuar (S/N)? ");
            resp = obj.next().toUpperCase().charAt(0);

        } while (resp == 'S');

        System.out.println("Gracias por utilizar el programa.");
    }
}