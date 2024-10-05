
import java.util.Scanner;

public class ejerciciosud3_7 {
    public static void main(String[] args) {
        try ( Scanner medidas = new Scanner(System.in)){
            System.out.println("porfavor introduce primer medida en milimetros: ");
            double mili = medidas.nextDouble();

            System.out.println("porfavor introduce primer medida en centimetros: ");
            double cm = medidas.nextDouble();
            
            System.out.println("porfavor introduce primer medida en metros: ");
            double m = medidas.nextDouble();

            //1m = 100 cm
            //1mm = 0.01cm

            double militot = mili * 0.01  ;
            double mtot = m / 0.01;
            double tot = mtot + cm + militot  ;

            System.out.println("La suma de las medidas son : " + tot+ "cm");
            

        }
    }
    
}
