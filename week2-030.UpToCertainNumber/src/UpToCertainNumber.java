
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int number;
        int inicio = 0;

        System.out.print("Up to what number? ");
        number = Integer.parseInt(reader.nextLine());

        while (inicio < (number + 1)) {
            System.out.println(inicio);
            inicio++;
        }   
    }
}
