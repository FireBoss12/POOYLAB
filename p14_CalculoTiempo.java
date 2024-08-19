// p14_CalculoTiempo - Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        int horas, dias, min, seg;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa las horas: ");
        horas = scanner.nextInt();

        dias = horas / 24;
        min = horas * 60;
        seg = horas * 3600;

        System.out.println("Dadas las horas         : " + horas);
        System.out.println("Equivalente en días     : " + dias);
        System.out.println("Equivalente en minutos  : " + min);
        System.out.println("Equivalente en segundos : " + seg);
    }
}
