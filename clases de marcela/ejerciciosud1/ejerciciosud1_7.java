import java.util.Scanner;

public class ejerciciosud1_7 {
    public static void main(String[] args) {
        // Try-with-resources kullanarak Scanner oluşturma
        try (Scanner scanner = new Scanner(System.in)) {
            // Kullanıcıdan ilk sayıyı alma
            System.out.print("Introduce el primer número: ");
            int num1 = scanner.nextInt();

            // Kullanıcıdan ikinci sayıyı alma
            System.out.print("Introduce el segundo número: ");
            int num2 = scanner.nextInt();

            // İki sayıdan hangisinin daha büyük olduğunu belirleme
            int mayor = (num1 > num2) ? num1 : num2;

            // Sonucu yazdırma
            System.out.println("El número mayor es: " + mayor);
        } // Scanner burada otomatik olarak kapatılacak
    }
}
