public class BankAccount {
    private String customerName;
    private int accountNumber;
    private double balance;
    public BankAccount (){
        this.customerName = "";
        this.accountNumber = 0;
        this.balance = 0.0;
    }
    public BankAccount (String customerName, int accountNumber, double balance){
        this.customerName = customerName; 
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public BankAccount(String customerName, int accountNumber){
        this.customerName = customerName; 
        this.accountNumber = accountNumber;
        this.balance = 50.0;
    }
    public void setCustomerName(String newName){
        this.customerName = newName;
    }
    public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }
    public void deposit (double amount){
        this.balance = this.balance + amount;
    }
    
}
