/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Domain.Client;
import Domain.CurrentAccount;

/**
 *
 * @author jorma
 */
public class ComercialBank {

    private Client client;
    private CurrentAccount currentAccount;

    public ComercialBank() {}

    public ComercialBank(Client client, CurrentAccount currentAccount) {
        this.client = client;
        this.currentAccount = currentAccount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    @Override
    public String toString() {
        return "ComercialBank{" + "client=" + client + ", currentAccount=" + currentAccount + '}';
    }
    
    
    

}//class
