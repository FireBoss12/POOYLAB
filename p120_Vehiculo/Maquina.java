package p120_Vehiculo;

public class Maquina {
    private String Nombre;
    private String Propietario;
    private int Pasajeros;
    
    public Maquina(String nombre, String propietario, int pasajeros) {
        Nombre = nombre;
        Propietario = propietario;
        Pasajeros = pasajeros;
    }

    public void repostar() {
        System.out.println("Repostando combustible...");
    }

    public void arrancar() {
        System.out.println("Arrancando el vehiculo...");
    }

    public void frenar() {
        System.out.println("Frenando el vehiculo...");
    }

    @Override
    public String toString() {
        return "Maquina [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Pasajeros=" + Pasajeros + "]";
    }
}
