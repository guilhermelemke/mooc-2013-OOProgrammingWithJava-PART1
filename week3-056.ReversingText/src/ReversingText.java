
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        
        String help = "";
        int tamanhoText = text.length() - 1;
        char character;
        // ...
        // adding a character to the help variable
        while (tamanhoText >= 0) {
            character = text.charAt(tamanhoText);
            help = help + character;
            tamanhoText--;
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
