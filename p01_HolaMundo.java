    // Envía un saludo a la pantalla

    public class p01_HolaMundo {
        public static void main(String[] args) {
            String amigo = "Adrián";
            String hermano = "Reynaldo";
            String mensaje = String.format("Tanto %s como %s desean aprender java", amigo, hermano);

            System.out.println("Hola Mundo en el Lenguaje Java");
            System.out.println("\nHola amigo " + amigo + " bienvenido a Java");
            System.out.println("\nMi amigo es " + amigo + " y mi hermano es " + hermano);
            System.err.println("\n" + mensaje);
        }
    }