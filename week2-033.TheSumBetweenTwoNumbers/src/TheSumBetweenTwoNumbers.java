
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numInicial = 0;
        int numFinal = 0;
        int sum = 0;

        System.out.print("First: ");
        numInicial = Integer.parseInt(reader.nextLine());

        System.out.print("Second: ");
        numFinal = Integer.parseInt(reader.nextLine());

        while (numInicial <= numFinal) {
            sum += numInicial;
            numInicial++;
        }
        System.out.println(sum);
    }
}
