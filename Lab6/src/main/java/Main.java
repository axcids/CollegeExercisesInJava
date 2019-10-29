
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the positive number 1: ");
        int num1 = input.nextInt();
        if (num1 < 0){
            do {
                System.out.println("You entered a negative number, enter the postive number 1: ");
                int num3 = input.nextInt();
                num1 = num3;
            }while(num1 < 0);
        }
        
        System.out.println("Enter the positive number 2: ");
        int num2 = input.nextInt();
        if (num2 < 0 ){
            do {
                System.out.println("You entered a negative number, enter the postive number 2: ");
                int num4 = input.nextInt();  
                num2 = num4;
            }while(num2 < 0);
            
        }
        
        System.out.println("The first positive number is: "+num1);
        System.out.println("The second positive number is: "+num2);
        System.out.println("So, "+num1+" + "+num2+" = "+(num1+num2));

    }
    
}
