import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int counter = 0;

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int stringLength = name.length();
        int counterLenght = stringLength - 1;

        System.out.print("In reverse order: ");

        while (counter < stringLength) {
            System.out.print(name.charAt(counterLenght));
            counterLenght--;
            counter++;
        }
    }
}
