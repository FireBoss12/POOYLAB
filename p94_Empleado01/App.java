package p94_Empleado01;

// Programa Principal

public class App {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado(); // Instanciar
        Empleado empleado2 = new Empleado(); // Instanciar

        empleado1.Nombre = "Juan Pérez";
        empleado1.Edad = 45;
        empleado2.Nombre = "María López";
        empleado2.Edad = 25;

        Empleado empleado3;
        empleado3 = new Empleado(); // Instanciar
        empleado3.Nombre = "El patito";
        empleado3.Edad = 1;

        System.out.print("\033[H\033[2J");
        System.out.println("Empleado 1 nombre: " + empleado1.Nombre);
        System.out.println("Empleado 1 Edad  : " + empleado1.Edad);
        System.out.println(empleado1.toString());
        System.out.println("Empleado 2 nombre: " + empleado2.Nombre);
        System.out.println("Empleado 2 Edad  : " + empleado2.Edad);
        System.out.println(empleado2.toString());
        System.out.println("Empleado 3 nombre: " + empleado3.Nombre);
        System.out.println("Empleado 3 Edad  : " + empleado3.Edad);
        System.out.println(empleado3.toString());
    }
    
}
