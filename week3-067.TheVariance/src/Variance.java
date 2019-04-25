import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int somatorio = 0;
        for (Integer numero : list) {
            somatorio = somatorio + numero;
        }
        return somatorio;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double) sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double difference = 0;
        double power = 0;
        double help = 0;
        double average = average(list);
        for (double number : list) {
            difference = number - average;
            power = Math.pow(difference, 2);
            help = help + power;
        }
        return help / (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
