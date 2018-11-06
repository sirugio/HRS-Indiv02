package hrs.indiv02;

public class E7 {

    public static void main(String[] agrs) {
        int numero, i;
        numero = 49;

        for (i = 49; i < 97; i++) {
            numero += 1;

            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
