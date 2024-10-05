
public class ejerciciosud3_10 {

    public static void main(String[] args) {
       try ( java.util.Scanner scanner = new java.util.Scanner(System.in)){
        // Scanner tam yolu ile
        System.out.print("Introduce un número real: ");
        double numero = scanner.nextDouble(); // Kullanıcının sayısı

        double raizCuadrada = java.lang.Math.sqrt(numero); // Kareköku Math.sqrt ile hesapla

        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada); // Sonucu göster

        scanner.close(); // Scanner'ı kapat
       }
    }
}
