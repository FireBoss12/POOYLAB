package p120_Vehiculo;

public class App {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); System.out.flush();
        Sedan miSedan = new Sedan("Vochito", "Maria Diaz", 4);
        System.out.println(miSedan);
        miSedan.sistemaElectrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTres();
        miSedan.chasisMonocaso();
        miSedan.repostar();
        miSedan.arrancar();
        miSedan.frenar();

        Suv miSuv = new Suv("La mamalona", "Carlos Castañeda", 6);
        System.out.println(miSuv);
        miSuv.sistemaElectrico();
        miSuv.sistemaElectrico();
        miSuv.combustionInterna();
        miSuv.traccion4x4();
        miSuv.chasisIndependiente();
        miSuv.repostar();
        miSuv.arrancar();
        miSuv.frenar();
    }
}
