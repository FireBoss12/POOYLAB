// p35_ContinentesMundo - Dado un número entre 1 y 6 que correspomde a un continente del mundo

import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args) {
        
        // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

        System.out.println("Dame un número entre 1 y 6 y te diré el continente al que pertenece el número ? ");
        int continente = new Scanner(System.in).nextInt();

        switch (continente) {
            case 1 : System.out.println("Asia"); break;
            case 2 : System.out.println("África"); break;
            case 3 : System.out.println("América del Norte"); break;
            case 4 : System.out.println("América del Sur"); break;
            case 5 : System.out.println("Antártida"); break;
            case 6 : System.out.println("Europa"); break;
            default:
            System.out.println("No existe continente para ese número");
                break;
        }
        System.out.println("\nGracias por utilizar este programa...");
    }
}
    
