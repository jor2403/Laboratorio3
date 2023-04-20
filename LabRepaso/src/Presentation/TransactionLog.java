
package Presentation;

import Domain.Account;
import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class TransactionLog {
    
    private int transactionId;
    private String event;
    private Date date;
    private Account account;
    private double movement;
    
    private static int consecutive = 0;

    public TransactionLog() {
        this.transactionId=++consecutive;
    }

    public TransactionLog(String event, Account account, double movement) {
        this();
        this.date = new java.util.Date();
        this.event = event;
        this.account = account;
        this.movement = movement;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    @Override
    public String toString() {
        return "TransactionLog{" + "transationId=" + transactionId + ", event=" + event + ", date=" + date + ", account=" + account + ", movement=" + movement + '}';
    }

    

    
    
}
