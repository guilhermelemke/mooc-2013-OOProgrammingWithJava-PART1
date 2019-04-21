public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created 
        // and set to have the correct initial values
        hours = new BoundedCounter(23);
        hours.setValue(hoursAtBeginning);
        minutes = new BoundedCounter(59);
        minutes.setValue(minutesAtBeginning);
        seconds = new BoundedCounter(59);
        seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        seconds.next();
            if (seconds.getValue() == 0) {
                this.minutes.next();
                if (minutes.getValue() == 0) {
                    this.hours.next();
                }
            }
        }
    
    public String toString() {
        // returns the string representation
        return hours + ":" + minutes + ":" + seconds;
    }
}
