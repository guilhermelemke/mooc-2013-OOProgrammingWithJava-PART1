
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int nota = Integer.parseInt(reader.nextLine());

        if (nota > 49) {
            System.out.print("Grade: 5");
        } else if (nota > 44 && nota < 50) {
            System.out.print("Grade: 4");
        } else if (nota > 39 && nota < 45) {
            System.out.print("Grade: 3");
        } else if (nota > 34 && nota < 40) {
            System.out.print("Grade: 2");
        } else if (nota > 29 && nota < 35) {
            System.out.print("Grade: 1");
        } else {
            System.out.print("Grade: failed");
        }
    }
}
