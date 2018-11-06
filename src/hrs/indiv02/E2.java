
package hrs.indiv02;
import java.util.Scanner;

public class E2 {
    public static void main (String[] agrs) {
        Scanner in = new Scanner (System.in);
        int numero;
        System.out.print("Introduzca un número: ");
        numero = in.nextInt();
        if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else
            System.out.println("El número es cero.");
    }  
}
