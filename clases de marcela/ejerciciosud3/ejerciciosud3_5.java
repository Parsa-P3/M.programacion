
import java.util.Scanner;

public class ejerciciosud3_5 {

    public static void main(String[] args) {
        try (Scanner degiskenler = new Scanner(System.in)) {
            System.out.println("para resolver el problema y = ax.ax + bx + c ");

            System.out.print("Ingresa la a: ");
            int a = degiskenler.nextInt();

            System.out.print("Ingresa la b: ");
            int b = degiskenler.nextInt();

            System.out.print("Ingresa la c: ");
            int c = degiskenler.nextInt();

            System.out.print("Ingresa la x: ");
            int x = degiskenler.nextInt();

            int resultado = a*b*a*b+b*x+c ;
            System.out.print("Y es = " + resultado);

        }
    }

}
