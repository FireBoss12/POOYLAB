// p27_AceptarEstudiante - Acepta a un estudiante en base a su edad y dos calificaciones


import java.util.Scanner;

public class p27_AceptarEstudiante {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double c1, c2;
        Scanner obj = new Scanner(System.in);
        
        // Limpiar la consola 
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Universidad Patito SA de CV\nSistema de Admisión");
        System.out.println("Dame tu nombre ? "); nombre = obj.nextLine();
        System.out.println("Dame tu edad   ? "); edad = obj.nextInt();

        if (edad<18) { 
            System.out.println("No aceotamos menor de edad en esta Universidad \n");
        } else { 
            System.out.println("Dame calificación 1 ?"); c1 = obj.nextFloat();
            System.out.println("Dame calificación 2 ?"); c2 = obj.nextFloat();
            if (c1<8 || c2<8) {
                System.out.println("\nNo tienes el promedio adecuado para entrar en esta Universidad...");
            } else System.out.printf("Bienvenido a esta Universidad " + nombre + "!!!, tus calificaciones %.2f y %.2f te lo permiten..", c1, c2);
        }
        System.out.println("\nGracias por usar este sistema... ");
            

    }
}
