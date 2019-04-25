
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter = 0;

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        if (name.length() > 2) {
            while (counter < name.length()) {
                System.out.println((counter + 1) + ". character: " + name.charAt(counter));
                counter++;
            }
        } else {
            System.out.println();
        }

    }
}
