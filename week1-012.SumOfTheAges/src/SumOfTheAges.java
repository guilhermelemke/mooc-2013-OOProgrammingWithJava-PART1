
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String name1 = reader.nextLine();
        System.out.print("Type your age: ");
        int idade1 = Integer.parseInt(reader.nextLine());

        System.out.println();

        System.out.print("Type your name: ");
        String name2 = reader.nextLine();
        System.out.print("Type your age: ");
        int idade2 = Integer.parseInt(reader.nextLine());

        System.out.println();

        int somaIdade = idade1 + idade2;

        System.out.print(name1 + " and " + name2 + " are " + somaIdade + " years old in total.");

    }
}
