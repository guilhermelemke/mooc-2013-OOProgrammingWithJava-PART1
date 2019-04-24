
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int inNumber;
        int outNumber;

        System.out.print("First: ");
        inNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        outNumber = Integer.parseInt(reader.nextLine());

        if (outNumber > inNumber) {
            while (inNumber < (outNumber + 1)) {
                System.out.println(inNumber);
                inNumber++;
            }
        }
    }
}
