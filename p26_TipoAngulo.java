import java.util.Scanner;

public class p26_TipoAngulo {
    public static void main(String[] args) {

        // Limpiar la consola 
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Dame un ángulo entre 0 y 360 grados y te diré su tipo:");
        int angulo = new Scanner(System.in).nextInt();

        if (angulo < 0 || angulo > 360) {
            System.out.println("De cual fumaste??..");
        } else {
            System.out.println("El tipo de ángulo es:");
            if (angulo < 90) {
                System.out.println("Agudo");
            } else if (angulo == 90) {
                System.out.println("Recto");
            } else if (angulo > 90 && angulo < 180) {
                System.out.println("Obtuso");
            } else if (angulo == 180) {
                System.out.println("Llano");
            } else if (angulo > 180 && angulo < 360) {
                System.out.println("Cóncavo");
            } else if (angulo == 360) {
                System.out.println("Completo");
            }
        }

        System.out.println("Ya casi te estás ganando tu torta de lomo del comedor...");
    }
}
