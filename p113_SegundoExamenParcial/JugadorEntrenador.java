package p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados,
            int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
        Total = salario + getBono();
    }
    
    @Override
    public double getBono() {
        return (Salario * 0.15) + (Proyectos * 100) + (Subordinados * 10);
    }

    @Override
    public String toString() {
        return "JugadorEntrenador [" + super.toString() + "Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripción=" + Descripcion + ", Salario=" + Salario + ", Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + ", Total=" + Total + "]"; 
    }
}
