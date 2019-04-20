public class Counter {
    private int value;
    private boolean check;
    //private int startingValue;
    
    public Counter (int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }
    
    public Counter (int startingValue) {
        this(startingValue, false);
    }
    
    public Counter (boolean check) {
        this(0, true);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        this.value++;
    }
    
    public void decrease() {
        if (check == false) {
            this.value--;
        } else if (check == true && this.value == 0) {
            this.value = 0;
        } else if (check == true && this.value > 0) {
            this.value--;
            if (this.value < 0) {
                this.value = 0;
            }
        }
    }
    
    //increase by parameter
    public void increase (int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }
    
    //decrease by parameter
    public void decrease (int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check == false) {
                this.value -= decreaseAmount;
            } else if (check == true && this.value == 0) {
                this.value = 0;
            } else if (check == true && this.value > 0) {
                this.value -= decreaseAmount;
                if (this.value < 0) {
                    this.value = 0;
                }
            } 
        }
    }
}
