// p23_ConvertirTemperaturas - Convierte de grados centígrados a grados Fahrenheit y viceversa

import java.util.Scanner;

public class p23_ConvertirTemperaturasv2 {

    public static void main(String[] args) {
        float temp, res;
        int op;
        Scanner obj = new Scanner(System.in);

        // Limpiar la consola 
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Convertir Temperaturas : ");
        System.out.println(" [ 1 ] Fahrenheit a Centígrados : ");
        System.out.println(" [ 2 ] Centígrados a Fahrenheit : ");
        System.out.println("Elige una opción: "); 
        op = obj.nextInt();

        if (op == 1) {
            System.out.println("Convirtiendo de Fahrenheit a Centígrados");
            System.out.println("Dame la temperatura en Fahrenheit: "); 
            temp = obj.nextFloat();
            res = (temp - 32) * 5f / 9f;
            System.out.printf("%.2f Fahrenheit equivale a %.2f Centígrados\n", temp, res);
        } else if (op == 2) {
            System.out.println("Convirtiendo de Centígrados a Fahrenheit");
            System.out.println("Dame la temperatura en Centígrados: "); 
            temp = obj.nextFloat();
            res = (temp * 9f / 5f) + 32;
            System.out.printf("%.2f Centígrados equivale a %.2f Fahrenheit\n", temp, res);
        } else {
            System.out.println("\nElegiste una opción inválida...");
        }

        System.out.println("\nGracias por utilizar este programa");

        // Cerrar el objeto Scanner
        obj.close();
    }
}
