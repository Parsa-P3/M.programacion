
import java.util.Scanner;

public class ejerciciosud2_13 {
    public static void main(String[] args) {
        try (Scanner notas = new Scanner(System.in)) {
            System.out.println("cuales tus notas de primer semestre? ");
            int primer = notas.nextInt();
            System.out.println("cuales tus notas de segundo semestre? ");
            int segundo = notas.nextInt();
            System.out.println("cuales tus notas de tercero semestre? ");
            int tercero = notas.nextInt();

            double media = (primer + segundo + tercero) / 3;

            System.out.println("calculo de tu media es :" + media );



        }
    }
}
