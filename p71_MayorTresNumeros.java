// p71_MayorTresNumeros - Calcula e imprime el mayor de 3 numeros

import java.util.Scanner;

public class p71_MayorTresNumeros {

    public static float Mayor(float n1, float n2, float n3) {

    float may=0;

    if (n1>n2 && n1>n3)     may = n1;
    else if(n2>n1 && n2>n3) may = n2;
    else if(n3>n1 && n3>n2) may = n3;
    return may;
    }

    public static void main(String[] args) {
        float n1, n2, n3, res;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.print("Dame tres numeros separados por espacio ? ");
        n1 = obj.nextFloat(); n2 = obj.nextFloat(); n3 = obj.nextFloat();
    
        res = Mayor(n1, n2, n3);

        if(!(res==1))
            System.out.println("\nEl mayor de los tres numeros es " + res);
        else
            System.out.println("\nNo hay ningun numero mayor en los numeros que introdujiste...");
        obj.close();
    } 
    
}
