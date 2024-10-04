import java.util.Scanner;

public class ejerciciosud3_3 {
    public static void main(String[] args) {
       try ( Scanner scanner = new Scanner(System.in)){
        
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        System.out.print("Ingresa otra número entero: ");
        int numero2= scanner.nextInt();
        int sumaNecesaria = (numero2 - (numero % numero2)) % numero2;
        
        System.out.println("A " + numero + " hay que sumarle " + sumaNecesaria + " para que el resultado sea múltiplo de ." + numero2);
        
       }
    }
}
