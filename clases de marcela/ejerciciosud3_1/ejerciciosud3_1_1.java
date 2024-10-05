
import java.util.Scanner;

public class ejerciciosud3_1_1 {
    public static void main(String[] args) {
        try (Scanner  PIZZA = new Scanner(System.in)){
            System.out.println("cuantas pizzas quieres facturar ? ");
            int piz = PIZZA.nextInt();
            double precpiz= piz * 9;

            System.out.println("el cliente es socio? (true / false)");
            boolean socio = PIZZA.nextBoolean();

            if ( socio ){
                precpiz = precpiz - (piz * 3);
            }


            System.out.println("el precio total es : " + precpiz );



        }
    }
    
}
