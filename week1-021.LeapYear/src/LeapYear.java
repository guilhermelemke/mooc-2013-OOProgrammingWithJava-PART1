
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int ano = Integer.parseInt(reader.nextLine());

        if (ano % 100 == 0 && ano % 400 == 0) {
            System.out.print("The year is a leap year.");
        } else if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.print("The year is a leap year.");
        } else {
            System.out.print("The year is not a leap year.");
        }
    }
}
