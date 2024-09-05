// p53_NumerosNa1

import java.util.Scanner;

public class p53_NumerosNa1 {
    public static void main(String[] args) {
       
        int n,p;
        Scanner obj = new Scanner(System.in);

        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Numeros de n a 1 con paso de p:");
        System.out.println("Desde donde  ?"); n = obj.nextInt();
        System.out.println("Con paso de  ?"); p = obj.nextInt();

        for(int i = n; i >= 1; i -= p) {
            System.out.printf("%d ", i);
        }
    }
}
