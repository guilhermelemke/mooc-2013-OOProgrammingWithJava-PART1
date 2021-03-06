
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int counter = 0;
        System.out.println(numberDrawn);

        while (true) {
            counter += 1;
            System.out.print("Guess a number: ");
            double palpite = Integer.parseInt(reader.nextLine());
            if (palpite == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (palpite < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + counter);
            } else {
                System.out.println("The number is lesser, guesses made: " + counter);
        }
    }
}
    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

