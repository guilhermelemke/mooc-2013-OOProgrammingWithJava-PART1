
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenNumbers = new NumberStatistics();
        NumberStatistics oddNumbers = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        
        while (true) {
            int numero = reader.nextInt();
                if (numero == -1) {
                    break;
                } else {
                    stats.addNumber(numero);
                  if (numero % 2 == 0) {
                      evenNumbers.addNumber(numero);
                  } else {
                      oddNumbers.addNumber(numero);
                  }
                }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenNumbers.sum());
        System.out.println("sum of odd: " + oddNumbers.sum());
        
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        /*
        NumberStatistics stats = new NumberStatistics();
        
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
        */
    }
}
