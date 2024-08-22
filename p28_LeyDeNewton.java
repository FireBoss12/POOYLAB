// p28_LeyDeNewton - Calcula fuerza, masa y aceleración de acuerdo a la seggunda ley de Newton

import java.util.Scanner;

public class p28_LeyDeNewton {
    public static void main(String[] args) {
        float f, m, a;
        char op;
        Scanner obj = new Scanner(System.in);

        // Limpiar la consola 
        System.out.print("\033[H\033[2J");
        System.out.flush();  
        System.out.println("Elige lo que deseas calcular : ");
        System.out.println("[F]uerza      (f = m * a)");     
        System.out.println("[M]asa        (m = f / a)");     
        System.out.println("[A]celeración (f = f / m)");     
        System.out.println("[S]alir del sistema...");
        System.out.println("Elige una opción ? "); op = obj.next().charAt(0);
        op = Character.toUpperCase(op);   
        f = m = a = 0;
        if (op == 'F') {
            System.out.println("Calculando la fuerza ");
            System.out.println("Dame la Masa ? "); m = obj.nextFloat();
            System.out.println("Dame la Aceleración ? "); a = obj.nextFloat();
            f = m*a;
            System.out.printf("La fuerza es %.2f \n", f);
        } else if (op == 'M') {
            System.out.println("Calculando la masa ");
            System.out.println("Dame la Fuerza ? "); f = obj.nextFloat();
            System.out.println("Dame la Aceleración ? "); a = obj.nextFloat();
            m = f/a;
            System.out.printf("La masaa es %.2f \n", m);
        } else if (op == 'A') {
            System.out.println("Calculando la aceleración ");
            System.out.println("Dame la Fuerza ? "); f = obj.nextFloat();
            System.out.println("Dame la Masa ? "); m = obj.nextFloat();
            a = f/m;
            System.out.printf("La Aceleración es %.2f \n", a);
        } else if (op == 'S') {
            System.out.println("Ps orale, a chiflar su mauser...");
        } else 
            System.out.println("Opción inválida...");

        System.out.println("Jale o no jale, nos vamos a lonchar... ");
    }
}