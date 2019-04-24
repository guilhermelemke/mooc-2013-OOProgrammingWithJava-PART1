
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = 0;
        int contador = 0;
        int i = 0;

        System.out.print("Until what? ");
        contador = Integer.parseInt(reader.nextLine());

        while (i <= contador) {
            result += i;
            i++;
        }
        System.out.println(result);
    }
}
