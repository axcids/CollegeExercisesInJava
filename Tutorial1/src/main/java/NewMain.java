import java.util.Scanner;
public class NewMain {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The two numbers are "+num1+" and "+num2);
        int plus = num1 + num2;
        int divide = num1 / num2;
        int minus = num1 - num2;
        int multiplication = num1 * num2;
        System.out.println(num1+" + "+num2+" = "+plus);
        System.out.println(num1+" / "+num2+" = "+divide);
        System.out.println(num1+" - "+num2+" = "+minus);
        System.out.println(num1+" x "+num2+" = "+multiplication);

    }
    
}
