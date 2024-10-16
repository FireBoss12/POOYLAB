package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;
    
    public Equipo() {
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        Nombre = nombre;
        Liga = liga;
        Jugadores = new ArrayList<>();
    }
    
    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (Jugador jugador : Jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.Total;
        }
        return total;
    }

    public int getTotalH() {
        int totalH = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.Sexo == 'H') {
                totalH++;
            }
        }
        return totalH;
    }

    public int getTotalM() {
        int totalM = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.Sexo == 'M') {
                totalM++;
            }
        }
        return totalM;
    }

    public void reporte() {
        System.out.println("Nombre del equipo       : " + Nombre);
        System.out.println("Liga del equipo         : " + Liga);
        System.out.println("total de hombres        : " + getTotalH());
        System.out.println("Total de mujeres        : " + getTotalM());
        System.out.println("Total de bonificaciones : " + getTotalBono());
        System.out.println("Total acumulado         : " + getTotal());
        for (Jugador jugador : Jugadores) {
            System.out.println("- " + jugador.toString());
        }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() + ", Total de bonificaciones=" + getTotalBono() + ", Total acumulado=" + getTotal() + "]";
    }
}
