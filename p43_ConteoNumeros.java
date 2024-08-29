// p43_ConteoNumeros - Cuenta y suma los numeros introducidos por el usuario

import java.util.Scanner;

public class p43_ConteoNumeros {
    public static void main(String[] args) {
        
        int c, n, s, cp, cn, cc;
        Scanner obj = new Scanner(System.in);

        // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();

        System.out.println("Cuenta y suma los numeros introducidos por el usuario\n");

        c = n = s = cp = cn = cc = 0;

        do {
            System.out.print("Numero ? "); n = obj.nextInt();
            if (n != 999) {
                c++; s+=n;
                if (n>0) cp++; else if (n<0) cn++; else cc++;
            }

        } while ( n != 999 ); 
            System.out.printf("\nIntrodujiste   : %d numeros", c);
            System.out.printf("\nLa suma es     : %d", s);
            System.out.printf("\nPositivos      : %d\nNegativos      : %d\nCero           : %d", cp, cn, cc);
    }
}