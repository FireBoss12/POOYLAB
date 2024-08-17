// p09_DividirEnCifras - Dividir un numero de 3 cifras en unidades, decenas y centenas y obtener la suma de sus dígitos individuales

import java.util.Scanner;

public class p09_DividirEnCifras {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int num, uni, dec, cen, suma;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un número entero de 3 cifras :");
        num = scanner.nextInt();

        cen = num / 100;
        dec = (num % 100) / 10;
        uni = num % 10;
        suma = cen + dec + uni;

        System.out.println("El numero introducido fue : " + num);
        System.out.println("Centenas                  : " + cen);
        System.out.println("Decenas                   : " + dec);
        System.out.println("Unidades                  : " + uni);
        System.out.println("La suma de los dígitos es : " + suma);
    }
}
