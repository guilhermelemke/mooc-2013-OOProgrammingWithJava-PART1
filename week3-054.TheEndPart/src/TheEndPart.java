import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Lenght of the end part: ");
        int part = (Integer.parseInt(reader.nextLine()));

        int tamanhoPalavra = word.length();
        int comecoPalavra = tamanhoPalavra - part;
        String result = word.substring(comecoPalavra, tamanhoPalavra);

        System.out.print("Result: " + result);
    }
}
