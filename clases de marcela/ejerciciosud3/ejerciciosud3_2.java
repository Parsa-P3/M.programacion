import java.util.Scanner;

public class ejerciciosud3_2 {
    public static void main(String[] args) {
       try ( Scanner scanner = new Scanner(System.in)){
        
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        // Calcular cuántos hay que sumar para que sea múltiplo de 7
        //Özet Bu ifadeyi bir bütün olarak düşünürsek:Bir sayı girildiğinde, o sayıya en az kaç eklemek gerektiğini buluyoruz.
        //Eğer sayı zaten bir 7'nin katıysa, 0 eklemek yeterlidir.Eğer değilse, en yakın 7'nin katına ulaşmak için gereken ekleme miktarını hesaplıyoruz.
        //Bu sayede, kullanıcı hangi sayıyı girerse girsin, doğru sonucu elde etmiş oluyoruz.
        int sumaNecesaria = (7 - (numero % 7)) % 7;
        
        System.out.println("A " + numero + " hay que sumarle " + sumaNecesaria + " para que el resultado sea múltiplo de 7.");
        
       }
    }
}
