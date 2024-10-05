
import java.util.Scanner;

public class ejerciciosud3_6 {

    public static void main(String[] args) {
        try (Scanner time = new Scanner(System.in)) {
            System.out.println("porfavot introducen cantidad de segundos: ");
            int totalsegundos = time.nextInt();

            //calcular segundos
            int horas = totalsegundos / 3600;
            int minutos = (totalsegundos % 3600) / 60;
            int segundos =  totalsegundos % 60 ;

            System.out.println(" segundos introduzicos son igual de : " + horas + " horas " + minutos + " minutos y " + segundos + " total segundos ");


        }
    }
}
