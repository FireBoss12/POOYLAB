// p11_CalcularAngulo - Calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        double angulo1, angulo2, angulo3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer ángulo  : ");
        angulo1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo ángulo : ");
        angulo2 = scanner.nextDouble();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.print("El tercer ángulo es : " + angulo3);
    }
    
}