public class SecondsOfTheYear {

    public static void main(String[] args) {   
        // In below an incomplete version of the program. Please complete it!
        
        int year = 365;
        int hourPerDay = 24;
        int minutePerHour = 60;
        int secondPerMinute = 60;

        int secondPerYear = year * hourPerDay * secondPerMinute * minutePerHour;
        System.out.println("There are " + secondPerYear + " seconds in a year");
    }

}
