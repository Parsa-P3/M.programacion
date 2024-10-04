
import java.util.Scanner;

public class ejerciciosud2_7 {
    public static void main(String[] args) {
        try (Scanner Edad = new Scanner(System.in)){

            System.out.println("introduzca un numero ");

            int no1 = Edad.nextInt();

            System.out.println("introduzca otra numero ");

            int no2 = Edad.nextInt();
            
           double media = (no1 + no2)  / 2.0;
            
            System.out.println("media aritmeticas de tu numeros son: " + media );

        }
    }
}
