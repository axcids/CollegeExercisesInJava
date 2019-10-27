import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Give an amount: Saudi Riyal: ");
        int amount = input.nextInt();
        int fiveHun = amount/500;
        int oneHun = amount%500/100;
        int fifties = amount%100/50;
        int tens = amount%50/10;
        int fives = amount%10/5;
        int ones = amount%5/1;
        int totalBills = fiveHun+oneHun+fifties+tens+fives+ones;
        System.out.println("The minimum number of bills required for the amount "+amount+" is: "+totalBills);
        System.out.println("500 SR:"+fiveHun);
        System.out.println("100 SR: "+oneHun);
        System.out.println("50 SR: "+fifties);
        System.out.println("10 SR: "+tens);
        System.out.println("5 SR: "+fives);
        System.out.println("1 SR: "+ones);
        
        
        
        
        
        
    }
    
}
