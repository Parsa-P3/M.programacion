
import java.util.Scanner;


public class ejerciciosud3_1{
    public static void main(String[] args) {
        try(Scanner main = new Scanner(System.in)){
        System.out.println("cuanto es la base imponible ? ");
        int base = main.nextInt();
        System.out.println("cuanto es la IVA ? ");
        int IVA = main.nextInt();
        int ivapercentaje = 100 / IVA;

        int resultado = ivapercentaje + base ;

        System.out.println(" aqui tienes la calcula: " +
                              "el iva es = " + ivapercentaje +
                             "% y total (base+iva)"  + resultado );
        
        

      
    
      }
    }

}