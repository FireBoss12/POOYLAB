// p24_PagaTrabajadorv2 - Calcular la paga de un trabajador, las horas extras se pagan al doble

import java.util.Scanner;

public class p24_PagaTrabajadorv2 {
    public static void main(String[] args) {
        String nombre;
        int horas, extra = 0;
        float paga, impuesto, tasa, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        tasa = 0.02f;

        // Limpiar la consola 
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Calculando la paga de un trabajador, las horas extra se pagan al doble (>40)");
        System.out.println("Dame tu nombre: "); 
        nombre = obj.nextLine();
        System.out.println("Horas trabajadas: "); 
        horas = obj.nextInt();
        System.out.println("Pago por hora: "); 
        paga = obj.nextFloat();

        if (horas > 40) {
            extra = horas - 40;
            pagabruta = 40 * paga + (extra * paga * 2);
        } else {
            pagabruta = horas * paga;
        } 

        // Calcular el impuesto y la paga neta
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        System.out.printf("El trabajador %s trabajó %d horas a una paga de %.2f pesos, a una tasa de %.2f%%\n", nombre, horas, paga, tasa * 100);
        System.out.printf("Paga bruta: %.2f pesos\n", pagabruta);
        System.out.printf("Impuesto: %.2f pesos\n", impuesto);
        System.out.printf("Paga neta: %.2f pesos\n", paganeta);

        // Cerrar el objeto Scanner
        obj.close();
    }
}
