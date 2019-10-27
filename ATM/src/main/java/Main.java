public class Main {
    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        System.out.println("-----------------------------------------");
        System.out.println("Customer Name: "+acc1.getCustomerName());
        System.out.println("Account Number: "+acc1.getAccountNumber());
        System.out.println("Account Balance: "+acc1.getBalance());
        BankAccount acc2 = new BankAccount("Ahmed", 2,100.0);
        System.out.println("-----------------------------------------");
        System.out.println("Customer Name: "+acc2.getCustomerName());
        System.out.println("Account Number: "+acc2.getAccountNumber());
        System.out.println("Account Balance: "+acc2.getBalance());
        BankAccount acc3 = new BankAccount("bader", 3);
        System.out.println("-----------------------------------------");
        System.out.println("Customer Name: "+acc3.getCustomerName());
        System.out.println("Account Number: "+acc3.getAccountNumber());
        System.out.println("Account Balance: "+acc3.getBalance());    
        
        acc1.deposit(1000);
        acc2.deposit(1000);
        acc3.deposit(1000);
        
        System.out.println("");
        System.out.println("********************************************");
        System.out.println("After Depositing 1000 in each account");
        System.out.println("********************************************");
        System.out.println("");
        
        System.out.println("-----------------------------------------");
        System.out.println("Customer Name: "+acc1.getCustomerName());
        System.out.println("Account Number: "+acc1.getAccountNumber());
        System.out.println("Account Balance: "+acc1.getBalance());
        System.out.println("-----------------------------------------");
        System.out.println("Customer Name: "+acc2.getCustomerName());
        System.out.println("Account Number: "+acc2.getAccountNumber());
        System.out.println("Account Balance: "+acc2.getBalance());
        System.out.println("-----------------------------------------");
        System.out.println("Customer Name: "+acc3.getCustomerName());
        System.out.println("Account Number: "+acc3.getAccountNumber());
        System.out.println("Account Balance: "+acc3.getBalance()); 
        
        acc1.withdraw(500);
        acc2.withdraw(200);
        
        System.out.println("");
        System.out.println("********************************************");
        System.out.println("After Withdrawing");
        System.out.println("********************************************");
        System.out.println("");
        
        System.out.println("Customer Name: "+acc1.getCustomerName());
        System.out.println("Account Number: "+acc1.getAccountNumber());
        System.out.println("Account Balance: "+acc1.getBalance());
        System.out.println("-----------------------------------------");
        System.out.println("Customer Name: "+acc2.getCustomerName());
        System.out.println("Account Number: "+acc2.getAccountNumber());
        System.out.println("Account Balance: "+acc2.getBalance());
    }
}
