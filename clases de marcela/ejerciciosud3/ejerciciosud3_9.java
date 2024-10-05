
import java.util.Scanner;

public class ejerciciosud3_9 {
    public static void main(String[] args) {
        try (Scanner ENTERADA = new Scanner(System.in) ){
            System.out.println("cantidad de entrada adulto : ");
            int adulto = ENTERADA.nextInt();
            double precadulto = adulto * 20;

            System.out.println("cantidad de entrada infantil : ");
            int infantil = ENTERADA.nextInt();
            double precinf = infantil * 15.5;

            double prectotal = precadulto + precinf ;
            if (prectotal >= 100) {
                prectotal = prectotal - (prectotal * 0.05);

            }

            System.out.println("El precio total es : " + prectotal );
        
        
        }
    }
}
