
import java.util.Scanner;

public class ejerciciosud2_8 {
    public static void main(String[] args) {
       
        try (Scanner Edad = new Scanner(System.in)){
            System.out.println("cuantos años tienes? ");
            int suedad = Edad.nextInt();
            boolean esMayorDeEdad = suedad >= 18 ;
            System.out.println("eres mayor de edad ? " + esMayorDeEdad);



             
        }
    }
}
