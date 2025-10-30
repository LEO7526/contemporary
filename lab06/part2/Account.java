public class Account  {
    // package protected
    String accountNumber;
    float balance;

    public Account(String accountNumber, float balance) {
        this.accountNumber = accountNumber;  
        this.balance = balance;
    }
    public float getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void decrease(float amount) {
        balance -= amount;
    }
    public void increase(float amount) {
        balance += amount;
    }
    
} // Account