package p119_Organismos;

public class Organismos {
    private String Nombre;

    public Organismos(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void respiración() {
        System.out.println("Respirando ... ");
    }

    public void movimiento() {
        System.out.println("Moviendose ... ");
    }

    public void crecimiento() {
        System.out.println("Creciendo ... ");
    }
}