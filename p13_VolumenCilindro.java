// p13_VolumenCilindro - Calcular el volumen de un cilindro dado su radio y altura

import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        double volumen, radio, altura;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio  : ");
        radio = scanner.nextDouble();
        System.out.print("Ingresa la altura : ");
        altura = scanner.nextDouble();

        volumen = Math.PI * (radio * radio) * altura;

        System.out.print("El volumen del clindro dado el radio de " + radio + " y altura de " + altura + " es : " + volumen);
        
    }   
}
