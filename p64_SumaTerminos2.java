// p64_SumaTerminos2

import java.util.Scanner;

public class p64_SumaTerminos2 {
    public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Dime el numero de terminos de desees ? "); int n = obj.nextInt();

        int s = 0;
        int num = 0;

        for(int i = 1; i <= n; i++) {
            num = num * 10 + 1;
            s += num;
            System.out.print(num);
            if (i < n) {
                System.out.print(" + ");
            }
        }   
        System.out.printf(" = %d", s);
        obj.close();
    }
}
