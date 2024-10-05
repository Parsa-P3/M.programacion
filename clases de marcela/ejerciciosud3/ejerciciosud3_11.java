
import java.util.Scanner;

public class ejerciciosud3_11 {
    public static void main(String[] args) {
        try (Scanner Math = new Scanner(System.in)){
            System.out.println("Introduce numero a :");
            double numeroa = Math.nextInt();

            System.out.println("Introduce numero b :");
            double numerob = Math.nextInt();
            boolean numeros = numeroa == numerob ;

            System.out.println("los numeros son igual ?: " + numeros);

        }
    }
}
