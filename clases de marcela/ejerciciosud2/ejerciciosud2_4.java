
import java.util.Scanner;

public class ejerciciosud2_4 {
    public static void main(String[] args) {
        try (Scanner Numero = new Scanner(System.in)){
            System.out.println("porfavor introduce un numero :");
            int numero1 = Numero.nextInt();
            int resultado = numero1 + 2 ;
            System.out.println("el numero introducido es : " + resultado + " (incrementado 2)");

    
        }
    }
}
