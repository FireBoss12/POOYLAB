// p21_VerificaNumero - Verifica si un número es positivo, negativo o cero

import java.util.Scanner;

public class p21_VerificaNumero {
    public static void main(String[] args) {

        // Limpiar la consola 
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Verificando si un número es positivo, negativo o cero \n");
        System.out.println("Dame un número entero: ");
        
        // Corrección en la creación del objeto Scanner
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        // Verificación del número
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo");
        } else {
            System.out.println("El número " + numero + " es cero");
        }

        System.out.println("\nGracias por usar este sistema tan sofisticado \n");
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
