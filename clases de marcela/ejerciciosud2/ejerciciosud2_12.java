
import java.util.Scanner;

public class ejerciciosud2_12 {
    public static void main(String[] args) {
        try(Scanner numero = new Scanner(System.in)){
            System.out.println("introducen un numero :");
            int absolutoo = numero.nextInt();
            System.out.println("absoluto de tu numero es :" + Math.abs(absolutoo)); 

        }
    }
    
}
