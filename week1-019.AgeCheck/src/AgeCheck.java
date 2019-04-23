
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int idade = Integer.parseInt(reader.nextLine());

        if (idade >= 0 && idade < 120) {
            System.out.print("OK");
        } else {
            System.out.print("Impossible!");
        }

    }
}
