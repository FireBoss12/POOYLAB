package p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        System.out.println("\nProbando clase CuentaBancaria");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial : " + c1.getsaldo());
        c1.deposita(10000);
        System.out.println("Saldo despues del 1er deposito : " + c1.getsaldo());
        double cr = 400;
        boolean rsn = c1.retira(cr);
        if (rsn) System.out.println("Retiraste: " + cr + ", te quedan : " + c1.getsaldo());
        else System.out.println("No tienes ni para los cigaroos, ponte a trabajar");

        System.out.println("\nProbando clase Cliente");
        Cliente cliente1 = new Cliente("Juan Perez", c1);
        System.out.println("Cliente 1 : " + cliente1);
        Cliente cliente2 = new Cliente("Carlos Castañeda", new CuentaBancaria(1000));
        System.out.println(cliente2);
        cliente2.getCuenta().retira(900);
        System.out.println(cliente2);
        cliente1.getCuenta().retira(9000);
        System.out.println(cliente1);
        cliente2.getCuenta().deposita(10000);
        System.out.println(cliente2);
        Cliente mimujer = new Cliente("Rocio", cliente2.getCuenta());
        mimujer.getCuenta().retira(10100);
        System.out.println(cliente2);

        System.out.println("\nProbando la clase banco");
        Banco mibanco = new Banco("Banco del Bienestar", "Campus Siglo XXI");
        mibanco.AgregarCliente(cliente1);
        mibanco.AgregarCliente(cliente2);
        mibanco.AgregarCliente(mimujer);
        mibanco.AgregarCliente(new Cliente("Claudia Sheinbaum", new CuentaBancaria(100000000)));
        mibanco.getClientes().get(3).getCuenta().retira(90000);
        mibanco.getClientes().get(0).getCuenta().deposita(30000);
        mibanco.getClientes().get(1).getCuenta().deposita(30000);
        mibanco.getClientes().get(2).getCuenta().deposita(30000);
        System.out.println("Los clientes del banco");
        double total = 0;
        for (Cliente cte : mibanco.getClientes()) {
            System.out.println(cte);
            total = total + cte.getCuenta().getsaldo();
        }

        System.out.printf("Total de dinero en el banco %.2f", total);
    }
}
