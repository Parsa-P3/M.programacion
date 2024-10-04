
import java.util.Scanner;

public class ejerciciosud2_9 {
    public static void main(String[] args) {
        
        try (Scanner Radio = new Scanner(System.in)){
            System.out.println("cual es la radio? ");
            int radio = Radio.nextInt();
            double longitud = radio * Math.PI * 2 ;

            System.out.println("la longitud es: " + longitud) ;

            double area =Math.pow(radio , 2 ) * Math.PI;

            System.out.println("el area es : " + area );

        }
    }
}
