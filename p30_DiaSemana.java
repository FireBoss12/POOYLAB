// p30_DiaSemana - Dado un numero entero entre 1 y 7, nos muestra el dia de la semana con letra

import java.util.Scanner;

public class p30_DiaSemana {
    public static void main(String[] args) {
            
        
        // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

        System.out.println("Dame un número entre 1 y 7 y te diré el día de la semana con letra ? ");
        int dia = new Scanner(System.in).nextInt();

        switch (dia) {
            case 1 : System.out.println("Domingo .. dormir"); break;
            case 2 : System.out.println("Lunes .. clase"); break;
            case 3 : System.out.println("Martes .. clase"); break;
            case 4 : System.out.println("Miércoles .. clase"); break;
            case 5 : System.out.println("Jueves .. Casi nos vamos"); break;
            case 6 : System.out.println("Viernes .. Juímonos"); break;
            case 7 : System.out.println("Sábado .. estudiar"); break;
            default:
            System.out.println("Aver ... quieres irte temprano a desayunar ? ");
                break;
        }
        System.out.println("\nGracias por utilizar este programa...");
    }
}