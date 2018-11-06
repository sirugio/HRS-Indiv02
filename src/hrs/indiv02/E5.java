
package hrs.indiv02;
import java.util.Scanner;

public class E5 {
    public static void main (String[] agrs) {
        Scanner in = new Scanner (System.in);
        int menu;
        
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        System.out.print("Introduzca una opción: ");
        menu = in.nextInt();
        
        if (menu == 1) {
            System.out.println("La operación es suma.");
        } else if (menu == 2) {
            System.out.println("La operación es resta.");
        } else if (menu == 3) {
            System.out.println("La operación es multiplicación.");
        } else if (menu == 4) {
            System.out.println("La operación es división.");
        } else if (menu == 5) {
            System.out.println("Cerrando programa...");
        } else
            System.out.println("Este número no coincide con ninguna de las opciones disponibles.");
        
        /*switch (menu) {
            case 1:
                System.out.println("La operación es suma.");
                break;
            case 2:
                System.out.println("La operación es resta.");
                break;
            case 3:
                System.out.println("La operación es multiplicación.");
                break;
            case 4:
                System.out.println("La operación es división.");
                break;
            case 5:
                System.out.println("Cerrando programa...");
                break;
            default:
                System.out.println("Este número no coincide con ninguna de las opciones disponibles.");
                break;*/
    }
}
