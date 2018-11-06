package hrs.indiv02;

import java.util.Scanner;

public class E3 {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Introduzca el primer número: ");
        numero1 = in.nextInt();
        System.out.print("Introduzca el segundo número: ");
        numero2 = in.nextInt();
        if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El número " + numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("El número " + numero1 + " y el número " + numero2 + " son iguales.");
        }
    }
}
