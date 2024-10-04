
import java.util.Scanner;

public class ejerciciosud2_6 {
    public static void main(String[] args) {
        try (Scanner Edad = new Scanner(System.in)){
            System.out.println("fecha de nacimiento? ");

            int edad1 = Edad.nextInt();

            System.out.println("Fecha de Hoy ? ");
            int año1 = Edad.nextInt();

            int resultado = año1 - edad1 ;

            System.out.println("tienes " + resultado + " años");




        }
    }
}
