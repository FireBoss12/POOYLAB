package p107_Forma;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Forma f1 = new Forma("Rojo"); No se puede instanciar una clase abstracta, así pensado

        Circulo c1 = new Circulo("Rojo", 10.22);
        Triangulo t1 = new Triangulo("Azul", 10, 20);

        ArrayList<Forma> formas = new ArrayList<>();

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println(c1);
        System.out.println(t1);

        formas.add(c1);
        formas.add(t1);
        formas.add(new Circulo("cafe", 45.50));
        formas.add(new Triangulo("purpura", 100,300));

        System.out.println("Las formas dentro del arreglo\n");
        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}