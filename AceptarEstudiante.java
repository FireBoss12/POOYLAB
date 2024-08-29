// p38_AceptarEstudianteversion2 - 

import java.util.Scanner;

public class AceptarEstudiante {
    public static void main(String[] args) {
        String nombre;
        char sexo;
        int edad;
        double c1, c2, c3, promedio;
        Scanner obj = new Scanner(System.in);
        
        // Limpiar la consola 
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Universidad Kitty Kat SA\nSistema de Admisión");
        System.out.println("Dame tu nombre ? "); nombre = obj.nextLine();
        System.out.println("Dame tu sexo (h/m) ? "); sexo = obj.next().charAt(0);
        System.out.println("Dame tu edad ? "); edad = obj.nextInt();

        if (sexo == 'h') {
            System.out.println("Lo siento, solo aceptamos mujeres en esta Universidad.");
        } else if (edad <= 21) {
            System.out.println("Lo siento, solo aceptamos mujeres mayores de 21 años en esta Universidad.");
        } else {
            System.out.println("Dame calificación 1 ?"); c1 = obj.nextDouble();
            System.out.println("Dame calificación 2 ?"); c2 = obj.nextDouble();
            System.out.println("Dame calificación 3 ?"); c3 = obj.nextDouble();
            
            promedio = (c1 + c2 + c3) / 3;
            
            if (promedio < 8 || promedio > 9.5) {
                System.out.println("\nNo tienes el promedio adecuado para entrar en esta Universidad...");
            } else {
                System.out.printf("Bienvenida a esta Universidad, %s!!!, tu promedio de %.2f te lo permite.", nombre, promedio);
            }
        }
        System.out.println("\nGracias por usar este sistema...");
    }
}
