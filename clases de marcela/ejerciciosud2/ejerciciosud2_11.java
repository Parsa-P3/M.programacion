
import java.util.Scanner;

public class ejerciciosud2_11 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        

            System.out.println("no esta lloviendo ? (true / false)");
            boolean lluviaa = sc.nextBoolean();

            System.out.println("si has terminado tus tareas ? (true / false)");
            boolean tareas= sc.nextBoolean();

            System.out.println("pero tienes que ir al biblioteca? (true/false)");
            boolean biblioteca = sc.nextBoolean();

            boolean salir = lluviaa && tareas || biblioteca;
            
            System.out.println("puedes salir: " + salir );


        }
    }

}
