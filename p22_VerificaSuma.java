//p22_VerificaSuma - Verifica si la suma de dos números es igual a un tercero

import java.util.Scanner;

public class p22_VerificaSuma {
    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        // Limpiar la consola 
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\nVerificando si la suma de dos números es igual a un tercero:\n");
        System.out.println("Dame numero 1 : "); n1 = obj.nextFloat();
        System.out.println("Dame numero 2 : "); n2 = obj.nextFloat();
        System.out.println("Dame numero 3 : "); n3 = obj.nextFloat();

        if (n1 + n2 == n3 ) {
            System.out.println("Son iguales");
            System.out.println(n1 + " + " + n2 + " = " + n3);
        }
        else {
            System.out.println("Son distintos");
            System.out.println(n1 + " + " + n2 + " != " + n3);
        }
        
        // Cerrar el objeto Scanner
        obj.close();

    }
    
}
