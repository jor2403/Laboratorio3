
package Presentation;

import Domain.Account;
import Domain.Client;
import Domain.CurrentAccount;
import Domain.SavingAccount;
import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class TransationLogTest {

    public TransationLogTest() {
    }

    public void test() {

        Client clients[] = new Client[10];

        clients[0] = new Client("1188700598", "jorG", "85457597", "turri");
        clients[1] = new Client("1000200000", "sawal", "70760000", "brazil");

        Date date = new Date(2022, 3, 1);
        float currentInterest = (float) (0.02);

        Account account[] = new Account[10];

        account[0] = new SavingAccount(date, 12, currentInterest, "1", clients[0], 100);
         account[1] = new SavingAccount(date, 12, currentInterest, "2", clients[1], 200);
       // account[2] = new CurrentAccount(currentInterest, "2",  clients[1], 200);
         
        TransactionLog tl[]= new TransactionLog[5];
        account[0].whithdraw(50);
        account[1].whithdraw(100);
        
        tl[0]= new TransactionLog("Whithdraw", account[0], 50);
        tl[1]= new TransactionLog("Whithdraw", account[1], 100);
        
        for (int i = 0; i < tl.length; i++) {
            if (tl[i]!=null) {
                System.out.println(tl[i]+"\n");
               
                
            }//if
            
        }//4
        
    }//test
}//class
