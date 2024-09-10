// p65_SistemaPapeleria

import java.util.Scanner;

public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        
        int ventaCarta=0, ventaOficio=0, ventaDobleOficio=0, totalVentas=0, totalCantidad=0, totalCarta=0, totalOficio=0, totalDobleOficio=0;
        char otra;
        Scanner obj = new Scanner(System.in);

        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("--------------------------------"); 
        System.out.println("Papelería La Malena, SA de CV"); 
        System.out.println("Sistema de ventas de copias");
        System.out.println("--------------------------------"); 

        do {
            System.out.println("Venta : " + (totalVentas + 1));
            System.out.println("Tipo de copia que desea (C)arta $3, (O)ficio $4, (D)oble Oficio $6? "); char tipo = obj.next().charAt(0);
            System.out.print("Cantidad ? "); int cantidad = obj.nextInt();

            switch (tipo) {
                case 'C' :
                case 'c' :
                    totalCarta += cantidad;
                    ventaCarta += cantidad * 3;
                    break;

                case 'O' :
                case 'o' :
                    totalOficio += cantidad;
                    ventaOficio += cantidad*4;
                    break;

                case 'D' :
                case 'd' :
                    totalDobleOficio += cantidad;
                    ventaDobleOficio += cantidad * 6;
                    break;
                default:
                    System.out.println("Tipo de copia no reconocida");
                    break;
            }

            totalVentas++;
            totalCantidad += cantidad;

            System.out.print("Quieres repetir el proceso (S/N) ? "); otra = obj.next().charAt(0);
        } while (otra == 'S');

        int totalDinero = ventaCarta + ventaOficio + ventaDobleOficio;

        System.out.println("--------------------------------"); 
        System.out.println("Resumen de ventas");
        System.out.println("--------------------------------"); 
        System.out.println("Ventas realizadas : " + totalVentas);
        System.out.println("--------------------------------"); 
        System.out.println("Carta : " + totalCarta + " - $ " + ventaCarta);
        System.out.println("Oficio : " + totalOficio + " - $ " + ventaOficio);
        System.out.println("DobleOficio : " + totalDobleOficio + " - $ " + ventaDobleOficio);
        System.out.println("--------------------------------"); 
        System.out.println("Total de ventas : " + totalCantidad + " - $ " + totalDinero);

        if (totalDinero < 50) {
            System.out.println("La venta fué : Venta moderada");
        } else if (totalDinero <=100) {
            System.out.println("La venta fué : Venta frecuente");
        } else { 
            System.out.println("La venta fué : Venta superada");
        } 
    }
}