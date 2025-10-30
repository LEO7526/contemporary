import java.util.*;
import java.util.Enumeration;

public class Customer  {

    String name;
    String address;
    Vector<Account> accounts;
    
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        accounts = new Vector<Account>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Enumeration getAccounts() {
        return accounts.elements();
    }
    

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
} // Customer