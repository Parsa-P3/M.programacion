
import java.util.Scanner;

public class ejerciciosud3_8 {
    public static void main(String[] args) {
        try (Scanner BIO = new Scanner(System.in)) {

            System.out.println("introduce el cantidad de hormigas de hoy :");
            int horm = BIO.nextInt();
            int hormigas = horm * 6 ;

            System.out.println("introduce el cantidad de arañas de hoy :");
            int araña = BIO.nextInt();
            int arañas = araña * 8 ;

            System.out.println("introduce el cantidad de cochillinas de hoy :");
            int cochi = BIO.nextInt();
            int cochillinas = cochi * 14 ;

            int totalpatas = hormigas + arañas + cochillinas ;
            System.out.println("Total patas de hoy  : " + totalpatas);

        }
    }
}
