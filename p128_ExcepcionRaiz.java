import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Por favor, introduce un número: ");
            float Numero = obj.nextFloat();

            if (Numero < 0) {
                System.out.println("Lo siento, no puedo sacar raíz de eso ... ");
            } else {
                double Raiz = Math.sqrt(Numero);
                System.out.println("La raíz cuadrada de " + Numero + " es: " + Raiz);
            }
        } catch (Exception e) {
            System.out.println("Por favor, ingresa un valor numérico ... ");
        } finally {
            obj.close();
        }
    }
}