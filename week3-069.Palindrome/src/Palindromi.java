
import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        if (text.equals(reverse(text))) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

    public static String reverse(String text) {
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
}
