/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.Date;

/**
 *
 * @author jorma
 */
public class CurrentAccount extends Account{
   
    private float interest;

    public CurrentAccount(float interest, String accountNumber, Client client, double balance) {
        super(accountNumber, client, balance);
     
        this.interest = interest;
    }

    @Override
    public double interestCalculation() {
        double totalInterests;

        totalInterests =  (this.getBalance()*this.getInterest())/12;
        return totalInterests;
    }

    @Override
    public void whithdraw(double money) {

        if (money > this.getBalance()) {
            System.out.println(" YOU DON'T HAVE ENOUGH MONEY");
        } else {
            super.setBalance(this.getBalance() - money);
            System.out.println(money + " HAS BEEN WITHDRAWN");
        }

    }

    @Override
    public void deposit(double money) {
        super.setBalance(this.getBalance() + money);
    }

  

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" + "interest=" + interest + '}';
    }

   
}//class
