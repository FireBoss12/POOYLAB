// p70_CalificacionLetra  Regresa una letra en base al promedio

import java.util.Scanner;

public class p70_CalificacionLetra {

    public static char CalifLetra (float prom) {
        char letra='X';
        if (prom >= 90 && prom <= 100)  letra = 'A';
        else if (prom >= 88 && prom <90) letra = 'B';
        else if (prom >= 78 && prom <88) letra = 'C';
        else if (prom >= 68 && prom <78) letra = 'D';
        else letra = 'F';
        return letra;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float prom;        
        // Limpiar la consola
            System.out.print("\033[H\033[2J");
        
        do {
        System.out.println("Dame tu promedio en la escala de 1 a 100 : "); prom = obj.nextFloat();
        } while (prom<0 || prom>100);

        System.out.println("Tu calificacion con letra es " + CalifLetra(0));
        obj.close();
    }
}
