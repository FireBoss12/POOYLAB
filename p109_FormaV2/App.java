package p109_FormaV2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
       Forma c1 = new Circulo("Rojo", true, 10.23);
       Forma c2 = new Circulo("Verde", false, 99.12);
       Forma r1 = new Rectangulo("Amarillo", false, 10.0, 20.0);
       Forma r2 = new Rectangulo("Azul", true, 15.0, 44.0);

       System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nTodas las formas : ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("Calculando áreas y perimetros de las figuras :");
        Forma[] formas = {c1, c2, r1, r2};
        for (Forma f : formas) {
            System.out.println(f);
            System.out.println("Área: " + f.getArea());
            System.out.println("Perímetro: " + f.getPerimetro() + "\n");
        }
    }
}