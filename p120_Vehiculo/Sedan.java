package p120_Vehiculo;

public class Sedan extends Maquina implements Familiar {
    
    public Sedan(String Nombre, String Propietario, int Pasajeros) {
        super(Nombre, Propietario, Pasajeros);
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es un Sedan");
    }
    
    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustion interna es un Sedan");
    }
    
    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan");
    }
    
    @Override
    public void chasisMonocaso() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan");
    }
}
