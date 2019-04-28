import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public int age() {
        int day;
        int month;
        int year;
        int idade;
        day = Calendar.getInstance().get(Calendar.DATE);
        month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        year = Calendar.getInstance().get(Calendar.YEAR);
        MyDate dataAtual = new MyDate(day, month, year);
        idade = birthday.differenceInYears(dataAtual);
        return idade;
    }
    
    public boolean olderThan(Person compared) {
        return (this.birthday.earlier(compared.birthday));
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    public Person (String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person (String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR));
    }
}
