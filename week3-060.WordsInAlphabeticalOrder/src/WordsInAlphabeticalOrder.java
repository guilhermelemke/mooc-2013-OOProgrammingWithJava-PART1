
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
     
        ArrayList<String> names = new ArrayList<String>();

        while (true) {
            System.err.print("Type a word: ");
            String nomesInseridos = reader.nextLine();

            if (nomesInseridos.isEmpty()) {
                Collections.sort(names);
                System.out.println("You typed the following words: ");
                for (String listaNomes : names) {
                    System.out.println(listaNomes);
                }
                break;
            } else {
                names.add(nomesInseridos);
            }
        }
    }
}

