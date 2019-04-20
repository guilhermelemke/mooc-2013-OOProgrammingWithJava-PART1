

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilherme
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard (double balanceAtStart) {
        // code
        this.balance = balanceAtStart;
    }
    
    public void loadMoney(double amount) {
        if ((this.balance) + amount < 151 && amount > 0) {
            this.balance = this.balance + amount;
        } else if (amount < 0){
            
        }
        else {
            this.balance = 150.00;
        }
    }
    
    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance = this.balance - 2.50;
        }
    }
    
    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance = this.balance - 4.00;
        }
    }
}
