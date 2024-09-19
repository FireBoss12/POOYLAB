//p75_CuadroCaracter - Dibuja un cuadro r x c del caracter deseado

import java.util.Scanner;

public class p75_CuadroCaracter {

    public static void cuadro(int r, int c, char car) {
        for(int i=1; i<= r; i++){
            for(int j=1; j<=c; j++)
                System.out.print(car);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int r, c;
        char car;
        Scanner obj = new Scanner(System.in);

        System.out.print("De cuantos renglones ? "); r = obj.nextInt();
        System.out.print("De cuantas columnas  ? "); c = obj.nextInt();
        System.out.print("De que caracter      ? "); car = obj.next().charAt(0);

        cuadro(r, c, car);

        obj.close();
    }
}
