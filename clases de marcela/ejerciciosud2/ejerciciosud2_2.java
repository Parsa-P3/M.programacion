
import java.util.Scanner;

public class ejerciciosud2_2 {

    public static void main(String[] args) {

       try (Scanner scanner = new Scanner(System.in)){

        System.out.println("porfavor introduce un numero: ");

        int numero = scanner.nextInt();

        int resultado = numero * 2;

        System.out.println("El número introducido, multiplicado por 2 es:" + resultado);
       }

    }
}
