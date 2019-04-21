
public class Student {
    private String name;
    private String studentNumber;
    
    public Student (String givenName, String givenStudenNumber) {
        this.name = givenName;
        this.studentNumber = givenStudenNumber;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
    
    public String toString() {
        return (this.name + " " + "(" + this.studentNumber + ")");
    }
}
