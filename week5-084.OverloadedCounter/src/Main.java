public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter c = new Counter (10, false);
        System.out.println(c.value());
        c.increase();
        c.increase(5);
        c.decrease();
        c.decrease(1);
        
    }
}
