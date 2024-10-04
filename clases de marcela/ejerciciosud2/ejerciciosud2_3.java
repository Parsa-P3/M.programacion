
import java.util.Scanner;

public class ejerciciosud2_3 {
    public static void main(String[] args) {
        try (Scanner numara = new Scanner(System.in)){
            System.out.println("profavor introduce 2 numeros");
            int numero1 = numara.nextInt(); 
            int numero2 = numara.nextInt();
            System.out.println("esto es la suma de los dos :" + (numero1 + numero2 )) ;
      
        }
    }
}
