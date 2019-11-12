
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Enter a psitive number less than 20");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        int total = 1;
        System.out.print("Factorial of "+in+" = ");
        if (in > 0 && in < 20){
            for(int i = 1; i <= in; i++){
                total = total * i;
                if(i < in)
                System.out.print(i+" * ");
                else 
                    System.out.print(i);
            }
            System.out.print(" = "+ total);
        }

    }
    
}
