// p52_Numeros1aN

import java.util.Scanner;

public class p52_Numeros1aN {
    public static void main(String[] args) {
        
        int n,p;
        Scanner obj = new Scanner(System.in);
    
        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Numeros de 1 a n con paso de p");
        System.out.println("Hasta donde  ?"); n = obj.nextInt();
        System.out.println("Con paso de  ?"); p = obj.nextInt();

        for(int i = 0; i <= n; i += p) {
            System.out.printf("%d ", i);
        }

    }
}
