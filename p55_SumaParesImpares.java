// p55_SumaParesImpares

import java.util.Scanner;

public class p55_SumaParesImpares {
    public static void main(String[] args) {
        int n, s, op;
        Scanner obj = new Scanner(System.in);
        
        do {
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Impares ascendente....[1]");
            System.out.println("Pares descendente.....[2]");
            System.out.println("Salir.................[3]");
            System.out.println("Elige ?"); op = obj.nextInt();

        switch (op) {
            case 1:
                s=0;
                System.out.println("\nImpares ascendente y su suma:");
                System.out.println("Hasta donde ?"); n = obj.nextInt();
                for(int i = 1; i <= n; i += 2) {
                    System.out.printf("%d ", i);
                    s += i;
                }
                System.out.printf("\nLa suma de impares es de: %d", s);
                break;
            case 2:
                s=0;
                System.out.println("\nPares descendente y su suma:");
                System.out.println("Hasta donde ?"); n = obj.nextInt();
                n = (n % 2 == 0 ? n : --n);
                for(int i = n; i >= 1; i -= 2) {
                    System.out.printf("%d ", i);
                    s += i;
                }
                System.out.printf("\nLa suma de pares es de: %d", s);
                break;
            case 3: 
                System.out.printf("\nTe vas porque quieres, nadie te corre");
                break;
            default:
                System.out.println("\nOpcion Invalida");
                break;
            }
            System.out.println("\nPresiona <Enter> para continuar");obj.nextLine();obj.nextLine();
        }   while( op != 3);
            System.out.println("\nProceso Terminao...");
    }
}
