
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Student pekka = new Student ("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);
         */

        ArrayList<Student> list = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                int stringTamanho = 0;
                System.out.println("");
                while (stringTamanho < list.size()) {
                    System.out.println(list.get(stringTamanho));
                    stringTamanho++;
                }
                break;
            }

            System.out.print("studentnumber: ");
            String studentnumber = scanner.nextLine();

            list.add(new Student(name, studentnumber));
        }
        
        System.out.println("");
        System.out.print("Give search term: ");
        String termoBusca = scanner.nextLine();
        System.out.println("Result:");
        for (Student student : list) {
            if (student.getName().contains(termoBusca)) {
                System.out.println(student.toString());
            }
        }
    }
}
