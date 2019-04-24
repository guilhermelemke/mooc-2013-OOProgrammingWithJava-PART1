import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 0;
        int contador = 1;
        int fatorial = 1;

        System.out.print("Type a number: ");
        number = Integer.parseInt(reader.nextLine());

        if (number == 0) {
            fatorial = 1;
            System.out.print("Factorial is 1");
        } else {
            while (contador <= number) {
                fatorial *= contador;
                contador++;
            }
            System.out.print("Factorial is " + fatorial);
        }
    }
}
