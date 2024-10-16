package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
        Total = salario + getBono();
    }

    @Override
    public double getBono() {
        return (Salario * 0.10) + (Partidos * 50) + (Goles * 5);
    }

    @Override
    public String toString() {
    return "JugadorActivo [" + super.toString() + "Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripción=" + Descripcion + ", Salario=" + Salario
    + ", Partidos=" + Partidos + ", Goles=" + Goles + ", Total=" + Total + "]";
    }
}