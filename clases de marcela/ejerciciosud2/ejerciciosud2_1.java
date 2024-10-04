
import java.util.Scanner;

public class ejerciciosud2_1 {

    public static void main(String[] args) {

//declaracion y creacion del objeto mi escanner (ejerciciosud2_1) , para la entrada por teclado
        try (Scanner ejerciciosud2_1 = new Scanner(System.in)){

        int miEntrada ;

        System.out.println("Introduzca un numero entero");
        miEntrada = ejerciciosud2_1.nextInt();

        System.out.println("el numero entroducido es ;" + miEntrada);
        }
    }
}
