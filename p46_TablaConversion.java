// p46_TablaConversion - Imprime tabla de conversion de peso a dolar en un rango determinado

import java.util.Scanner;

public class p46_TablaConversion {
    public static void main(String[] args) {
        int ini, fin, c;
        float tc = 20.74f, te = 25.00f;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            // Limpiar la consola
            System.out.print("\033[H\033[2J"); System.out.flush();

            System.out.println("Tabla de conversion de $ Peso a $$ Dollar ");

            do {
                System.out.println("Dame inicio : "); ini = obj.nextInt();
                System.out.println("Dame final  : "); fin = obj.nextInt();
            } while (fin < ini); //Valida que inicio sea menor que fin

            c = ini;
            System.out.println("\tPeso \t\t   Dollar \t\t     Euro");
            System.out.println("--------------------------------------------------------------------");
            while (c <= fin) {
                System.out.printf("%11d       -    %10.2f         -        %7.2f\n", c, c * tc, c * te);
                c++;
            }
            System.out.println("--------------------------------------------------------------------");

            System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');

    }   
} 