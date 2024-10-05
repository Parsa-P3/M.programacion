
import java.util.Scanner;

public class ejerciciosud3_12 {
    public static void main(String[] args) {
        try (Scanner  FILA = new Scanner(System.in)){
            System.out.println("Introduce Longuitud de primer lanzamiento (metros) :");
            double primer = FILA.nextDouble();
            double Longuitud1 = primer ;
            int ranking1 = (int) (Longuitud1 * 100) ;





            System.out.println("Introduce Longuitud de segundo lanzamiento (metros) :");
            double segundo = FILA.nextDouble();
            double Longuitud2 = segundo ;
            int ranking2 = (int) (Longuitud2 * 100) ;
            
            System.out.println("El ranking del primero es: " + ranking1 + " el ranking del segundo es : " + ranking2 );

            if (ranking1 > ranking2){
                System.out.println("el ganador es primero");
            }
            if (ranking2 > ranking1){
                System.out.println("el ganador es segundo");
            }



        }
    }
    
}
