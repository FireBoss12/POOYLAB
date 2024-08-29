// p37_CalculoNotas - Calcular el promedio de 5 calificaciones introducidas por el usuario

import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        System.out.println("Introduce la calificación 1: ");
        double cal1 = scanner.nextDouble();
        suma += cal1;

        System.out.println("Introduce la calificación 2: ");
        double cal2 = scanner.nextDouble();
        suma += cal2;

        System.out.println("Introduce la calificación 3: ");
        double cal3 = scanner.nextDouble();
        suma += cal3;

        System.out.println("Introduce la calificación 4: ");
        double cal4 = scanner.nextDouble();
        suma += cal4;

        System.out.println("Introduce la calificación 5: ");
        double cal5 = scanner.nextDouble();
        suma += cal5;

        double promedio = suma / 5;

        if (promedio > 0 && promedio <= 6) {
            System.out.printf("Quedas reprobado, tu promedio fué de : %.2f", promedio);
        } else if (promedio > 6 && promedio <= 7) {
            System.out.printf("Pasas de panzazo, tu promedio fué de : %.2f", promedio);
        } else if (promedio > 7 && promedio <= 8) {
            System.out.printf("Muy bien, puedes mejorar, tu promedio fué de : %.2f", promedio);
        } else if (promedio > 8 && promedio <= 9) {
            System.out.printf("Excelente, sigue así, tu promedio fué de : %.2f", promedio);
        } else if (promedio > 9 && promedio <= 10) {
            System.out.printf("Perfecto, tu esfuerzo valió la pena, tu promedio fué de : %.2f", promedio);
        } else {
            System.out.println("Promedio no válido");
        }
    }
}
