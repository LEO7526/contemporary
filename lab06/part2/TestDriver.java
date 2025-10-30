import java.io.*;
import java.util.*;

public class TestDriver {
     public static void main(String args[]) {
        // Peter has two accounts 
        Customer peter = new Customer("Peter", "Wanchai");
        Account a1 = new Account("INT001", 100);
        Account a2 = new Account("INT002", 200);
        peter.addAccount(a1); peter.addAccount(a2);
       
        System.out.println( "SuperBank Customer: " + peter.getName() + " "
                             + "at address: " + peter.getAddress());
        for (Enumeration xx = peter.getAccounts();
              xx.hasMoreElements();) {
             Account x = (Account)(xx.nextElement());
             System.out.println("Account Number: " + x.getAccountNumber() + " "
                                 + "has balance " + x.getBalance());
        }

        CareTaker ct = new CareTaker();
        ct.save
        
     } 
} 