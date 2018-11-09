
package hrs.indiv02;

import java.util.Scanner;

public class E10 {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int numero, i;

        System.out.print("Introduzca un número: ");
        numero = in.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
            for (i = numero - 1; i >= 1; i--) { 
                if (numero % i == 0) {
                    System.out.println("El número " + numero + " es divisible entre: " + i);
                }
            }
        } else 
            System.out.println("Fin de programa.");       
    }
}
