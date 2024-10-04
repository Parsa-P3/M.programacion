

public class ejerciciosud1_10 {
    public static void main(String[] args) {
        String text1 = "HOY PUEDE SER UN GRAN DIA" ;
        String textfinal = text1
              .replace("O", "0") 
              .replace("E", "3") 
              .replace("A", "4") 
              .replace("I", "1") ;

        System.out.println(textfinal);

    }
    
}
