package hrs.indiv02;

import java.util.Scanner;

public class E4 {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2, resultado;

        System.out.print("Introduzca el primer número: ");
        numero1 = in.nextInt();
        System.out.print("Introduzca el segundo número: ");
        numero2 = in.nextInt();
        if (numero1 > numero2) {
            resultado = numero1 - numero2;
            System.out.println( + numero1 + " - " + numero2 + " es: " + resultado);
        } else if (numero1 < numero2) {
            resultado = numero1 + numero2;
            System.out.println( + numero1 + " + " + numero2 + " es: " + resultado);
        } else {
            resultado = numero1 * numero2;
            System.out.println( + numero1 + " x " + numero2 + " es: " + resultado);
        }
    }
}
