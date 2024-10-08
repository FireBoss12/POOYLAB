package p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Vehiculo v1 = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        Vehiculo v2 = new Compacto("CP0100145555", "Nissan", 2010, 54500.33, 6, 4);
        Vehiculo v3 = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        Vehiculo v4 = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

        System.out.print("\033[H\033[2J");
        System.out.println("\nDatos de los vehiculos de la flota");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println("\nCalculando el total de precio de todos los vehiculos..");
        double suma = v1.getPrecio() + v2.getPrecio() + v3.getPrecio() + v4.getPrecio();
        System.out.println("La suma de precios es: " + suma);
    }
}
