
package Domain;

/**
 *
 * @author Laboratorios
 */
public abstract class Account {

    private String accountNumber;
    private Client client;
    private double balance;
    
     public Account() {}

    public Account(String accountNumber, Client client, double balance) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double interestCalculation();

    public abstract void whithdraw(double money);

    public abstract void deposit(double money);

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber +  ", balance=" + balance +"\n"+ "Client=" + client.toString() ;
    }

    

}
