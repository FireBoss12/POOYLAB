package p110_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String domicilio;
    private ArrayList<Cliente> clientes;
    public Banco() {
        clientes = new ArrayList<>();
    }
    public Banco(String nombre, String domicilio) {
        this(); // Invoca al constructor vacio de la misma clase
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    public void AgregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    @Override
    public String toString() {
        return "Banco [Nombre=" + nombre + ", Domicilio=" + domicilio + ", Clientes=" + clientes.size() + "]";
    }
    
}
