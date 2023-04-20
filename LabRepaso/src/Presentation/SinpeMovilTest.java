/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Domain.Account;
import Domain.Client;
import Domain.CurrentAccount;
import Logic.BCR;
import Logic.CentralBank;
import Logic.ComercialBank;
import Logic.NationalBank;

/**
 *
 * @author jorma
 */
public class SinpeMovilTest {

    public SinpeMovilTest() {}
    
    public void sinpeTest() {
        ComercialBank comercialB[] = new ComercialBank[5];
        Client client[] = new Client[5];
        client[0] = new Client("18700598", "jorG", "85457597", "turri");
        client[1] = new Client("10004000", "sawal", "88800033", "braziu");
        
        Account account[] = new Account[5];
        account[0] = new CurrentAccount(12, "1", client[0], 10000);
        account[1] = new CurrentAccount(12, "2", client[1], 40000);
        
        comercialB[0] = new BCR(client[0], (CurrentAccount) account[0]);
        comercialB[1] = new NationalBank(client[1], (CurrentAccount) account[1]);
     
      for (int i = 0; i < comercialB.length; i++) {
            if (comercialB[i]!=null) {
                System.out.println(comercialB[i]+"\n");
               
              }//if
            }//4
            
      }//sinpe 
    }//cl
    
    
    

