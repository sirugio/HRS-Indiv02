package hrs.indiv02;

import java.util.Scanner;

public class E10 {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int numero, i, numero2;

        System.out.print("Introduzca un número: ");
        numero = in.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
            for (i = numero; i >= 1; i--) {
                numero2 = numero; 
                if (numero2 % i == 0) {
                    System.out.println("El número " + numero2 + " es divisible entre: " + i);
                }
            }
        } else 
            System.out.println("Fin de programa.");       
    }
}
