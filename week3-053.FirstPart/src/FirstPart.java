
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Lenght of the first part: ");
        int part = Integer.parseInt(reader.nextLine());

        String result = word.substring(0, part);

        System.out.print("Result: " + result);
    }
}
