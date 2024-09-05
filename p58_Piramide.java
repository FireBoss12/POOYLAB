// p58_Piramide 

import java.util.Scanner;

public class p58_Piramide {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("De cuantos renglones ? "); int r = obj.nextInt();
        System.out.print("De qué caracter      ? "); int c = obj.next().charAt(0);

        for( int i = 1; i <= r; i++) {
            
            for(int j = 1; j <= i; j++)
                System.out.print(c);

            System.out.println();
        }
        obj.close();
    }
}