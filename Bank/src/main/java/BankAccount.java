public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    
    public BankAccount(){
        accountNumber = 0;
        balance = 0;
        customerName = "";
    }
    public BanckAccount(int accountNumber, double balance, String customerName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }
}
