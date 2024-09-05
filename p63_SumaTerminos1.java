// p63_SumaTerminos

import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Dime el numero de terminos de desees ? "); int n = obj.nextInt();

        double s = 0;

        for(int i = 1; i <= n; i++) {
            double num = 1.0 / i;
            s += num;
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
        }   
        System.out.printf(" = %.4f", s);
        obj.close();
    }
}