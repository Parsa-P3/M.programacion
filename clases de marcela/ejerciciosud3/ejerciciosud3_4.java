import java.util.Scanner;

public class ejerciciosud3_4 {
    public static void main(String[] args) {
         try (Scanner gen = new Scanner(System.in)){
        //calcular area de triangulo
        System.out.print("Ingresa la base: ");
        int base = gen.nextInt();
        System.out.print("Ingresa la altura: ");
        int altura = gen.nextInt();
        //area= base * altura / 2
        int area = ( base * altura ) / 2;

        System.out.print("area de triangulo es : " + area);
        
       }
     }
    
}