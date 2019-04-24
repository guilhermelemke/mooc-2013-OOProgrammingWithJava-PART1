
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = 0;
        int number;
        int contador = 0;

        System.out.print("Type a number: ");
        number = Integer.parseInt(reader.nextLine());

        while (contador <= number) {
            result += (int) Math.pow(2, contador);
            contador++;
        }
        System.out.print("The result is " + result);
    }
}
