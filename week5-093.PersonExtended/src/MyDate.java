
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
     public int differenceInYears (MyDate compareDate) {
        double yearDiff = 0.00;
        
        if (this.year > compareDate.year) {
            yearDiff = (this.year + (double) this.month / 12 + (double) this.day / 360)
                    - (compareDate.year + (double) compareDate.month / 12
                    + (double) compareDate.day / 365);
        } else {
            yearDiff = (compareDate.year + (double) compareDate.month / 12
                    + (double) compareDate.day / 365)
                    - (this.year + (double) this.month / 12 + (double) this.day / 365);
        }
        return (int) yearDiff;
    }
    
     /*
    public int differneceInYears(MyDate compared) {
        return -99;
    */

}

  

