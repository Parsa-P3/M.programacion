
import java.util.Scanner;

public class ejerciciosud2_5 {
    public static void main(String[] args) {
        try (Scanner Edad = new Scanner(System.in)){
            System.out.println("Cuantos años tienes? ");
            int edad1 = Edad.nextInt();
            int resultado = edad1 + 1 ;
            
            System.out.println("proxime año tendras " + resultado + " años");

        }
    }
}
