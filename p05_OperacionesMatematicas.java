//p05_OperacionesMatematicas - Realiza operaciones matemáticas

public class p05_OperacionesMatematicas {
    public static void main(String[] args) {
        double x, y, suma, resta, mult, div, res, pot;

        x = 10.5;
        y = 2.5;

        suma = x + y;
        resta = x - y;
        mult = x * y;
        div = x / y;
        res = x % y;
        pot = Math.pow(x, y);

        System.out.println(String.format("Los número son %.2f , %.2f ", x, y ));
        System.out.println(String.format("La suma es              : %.2f", suma));
        System.out.println(String.format("La resta es             : %.2f", resta));
        System.out.println(String.format("La multiplicación es    : %.2f", mult));
        System.out.println(String.format("La división es          : %.2f", div));
        System.out.println(String.format("El residuo es           : %.2f", res));
        System.out.println(String.format("La potencia es          : %.2f", pot));

    }

    
}