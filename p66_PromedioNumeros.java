// p66_PromedioNumeros - Calcular el promedio de 3 numeros usando una función

import java.util.Scanner;

public class p66_PromedioNumeros {

    public static float Promedio(float num1, float num2, float num3) {
        float suma, prom;
        suma = num1 + num2 + num3;
        prom = suma / 3;
        return prom;
    }

    public static void main(String[] args) {
        float n1, n2, n3, prom;
        Scanner obj = new Scanner(System.in);
        
        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        
        System.out.println("Dados tres numeros flotantes, obtener su promedio");

        System.out.println("Dame el primer numero : "); n1 = obj.nextFloat();
        System.out.println("Dame el segundo numero : "); n2 = obj.nextFloat();
        System.out.println("Dame el tercer numero : "); n3 = obj.nextFloat();

        prom = Promedio(n1, n2, n3);

        System.out.printf("\nEl promedio es %2f", prom);
        obj.close();
    }
}