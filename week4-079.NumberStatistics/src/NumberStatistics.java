
import java.util.ArrayList;


public class NumberStatistics {
    private int amountOfNumbers;
    private ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
    
    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers = this.amountOfNumbers;
    }
    
    public void addNumber (int number) {
        amountOfNumbers = 1 + amountOfNumbers;
        listaNumeros.add(number);
    }
    
    public int amountOfNumbers() {
        int numberCounter = amountOfNumbers;
        return numberCounter;
    }
    
    public int sum() {
        int sumCounter = 0;
        for (Integer a : listaNumeros) {
            sumCounter = a + sumCounter;
        }
        return sumCounter;
    }
    
    public double average() {
        double averageTotal = 0;
        if (amountOfNumbers != 0) {
            averageTotal = (double)sum() / this.amountOfNumbers;
        }
        return averageTotal;
    }
}
