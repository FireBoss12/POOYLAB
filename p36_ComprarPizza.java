// p36_ComprarPizza - Un usuario puede elegir un tamaño de pizza

import java.util.Scanner;

public class p36_ComprarPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PRECIO_CHICA = 5;
        final int PRECIO_MEDIANA = 10;
        final int PRECIO_GRANDE = 20;

        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Elige el tamaño de la pizza (chica[$5], mediana[$10], grande[$20]): ");
        String tamaño = scanner.nextLine().toLowerCase();

        System.out.println("¿Cuántas pizzas deseas comprar?: ");
        int cantidad = scanner.nextInt();

        int precio = 0;
        switch (tamaño) {
            case "chica":
                precio = PRECIO_CHICA;
                break;
            case "mediana":
                precio = PRECIO_MEDIANA;
                break;
            case "grande":
                precio = PRECIO_GRANDE;
                break;
            default:
                System.out.println("Tamaño no válido.");
                return;
        }

        int totalCompra = precio * cantidad;
        double descuento = 0;
        double totalConDescuento = totalCompra;

        if (totalCompra > 2000) {
            descuento = totalCompra * 0.15;
            totalConDescuento = totalCompra - descuento;
        }

        System.out.println("\nTamaño de la pizza: $" + tamaño);
        System.out.println("Cantidad comprada:    $" + cantidad);
        System.out.println("Total de la compra:   $" + totalCompra);
        System.out.println("Descuento:            $" + descuento);
        System.out.println("Total con descuento:  $" + totalConDescuento);
    }
}