
import java.util.Scanner;

public class ejerciciosud2_10 {

    public static void main(String[] args) {
        try (Scanner Numero = new Scanner(System.in)) {
            System.out.println("introduze un numero : ");
            int numero = Numero.nextInt();
            boolean par = numero % 2 == 0;
            System.out.println("numero es par? = " + par);

        }
    }
}
