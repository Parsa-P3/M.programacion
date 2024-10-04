import java.util.Random;

public class ejerciciosud1_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101); // Genera un número entre 0 y 100
        System.out.println("Número aleatorio entre 0 y 100: " + randomNumber);
    }
}