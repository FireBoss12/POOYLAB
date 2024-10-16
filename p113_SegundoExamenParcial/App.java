package p113_SegundoExamenParcial;

public class App {
    public static void main(String[] args) {

        Equipo miequipo = new Equipo("México", "Copa del Mundo 2026");
        System.out.print("\033[H\033[2J");
        miequipo.agregarJugador(new JugadorEntrenador("Javier Aguirre", 'H', "Entrenador Técnico", 40000, 8, 1));
        miequipo.agregarJugador(new JugadorEntrenador("Rafael Marquez", 'H', "Entrenador auxiliar", 20000, 10, 2));
        miequipo.agregarJugador(new JugadorActivo("Raul Rangel", 'H', "Portero", 15000, 2, 2));
        miequipo.agregarJugador(new JugadorActivo("Brian García", 'H', "Defensa", 15000, 3, 2));
        miequipo.agregarJugador(new JugadorActivo("Jesús Orozco", 'H', "Defensa", 15000, 4, 1));
        miequipo.agregarJugador(new JugadorActivo("Víctor Guzmán", 'H', "Defensa", 15000, 2, 3));
        miequipo.agregarJugador(new JugadorActivo("Gerardo Arteaga", 'H', "Defensa", 15000, 6, 2));
        miequipo.agregarJugador(new JugadorActivo("Edson Álvarez", 'H', "Mediocampista", 15000, 25, 20));
        miequipo.agregarJugador(new JugadorActivo("Orbelín Pineda", 'H', "Mediocampista", 15000, 20, 15));
        miequipo.agregarJugador(new JugadorActivo("Fernando Beltrán", 'H', "Mediocampista", 15000, 15, 10));
        miequipo.agregarJugador(new JugadorActivo("César Huerta", 'H', "Delantero", 15000, 10, 30));
        miequipo.agregarJugador(new JugadorActivo("Roberto Alvarado", 'H', "Delantero", 15000, 15, 30));
        miequipo.agregarJugador(new JugadorActivo("Guillermo Martínez", 'H', "Delantero", 15000, 20, 25));
        miequipo.reporte();
    }
}
