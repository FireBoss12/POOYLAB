// p68_SumaRango - Suma un rango de valores enteros definido por el usuario

import java.util.Scanner;

public class p68_SumaRango {

    public static int SumaRango(int ini, int fin) {
        int suma = 0;
        for(int i = ini; i <=fin; i++) {
            suma = suma + i;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // Limpiar la consola
        System.out.print("\033[H\033[2J");

        int suma = 0, ini, fin;

        do {
            System.out.print("Dame el incio ? "); ini = obj.nextInt();
            System.out.print("Dame el fin   ? "); fin = obj.nextInt();
        } while ( ini > fin);

        for(int i = ini; i <=fin; i++) {
            suma = suma + i;
        }
        System.out.println("\nLa suma del rango es : " + suma);
        obj.close();
    }
}
