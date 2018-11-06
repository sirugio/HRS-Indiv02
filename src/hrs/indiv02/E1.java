package hrs.indiv02;

import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        System.out.print("Introduzca un número: ");
        numero = in.nextInt();
        if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número " + numero + " es positivo.");
        }
    }
}
