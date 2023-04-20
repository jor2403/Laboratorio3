
package Domain;

import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class SavingAccount extends Account {

    private Date date;
    private int monthlyTerm;
    private float interest;

    public SavingAccount(Date date, int monthlyTerm, float interest, String accountNumber, Client client, double balance) {
        super(accountNumber, client, balance);
        this.date = date;
        this.monthlyTerm = monthlyTerm;
        this.interest = interest;
    }

    @Override
    public double interestCalculation() {
        double totalInterests;

        totalInterests = this.getMonthlyTerm()* this.getBalance()* this.getInterest();
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMonthlyTerm() {
        return monthlyTerm;
    }

    public void setMonthlyTerm(int monthlyTerm) {
        this.monthlyTerm = monthlyTerm;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+ "SavingAccount{" + "date=" + date + ", monthlyTerm=" + monthlyTerm + ", interest=" + interest + '}';
    }

    

}
