import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    int lengthPassword;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.lengthPassword = length;
    }

    public String createPassword() {
        int contador = 0;
        ArrayList<Character> password = new ArrayList<Character>();
        String passwordFinal = "";
        
        while (contador < this.lengthPassword) {
            int posicoes = (this.random.nextInt(26));
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(posicoes);
            password.add(symbol);
            passwordFinal += Character.toString(symbol);
            contador++;
        }
        // write code that returns a randomized password
        return passwordFinal;
    }
}
