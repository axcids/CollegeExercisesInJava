
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a psitive number"); 
        int in = input.nextInt();
        int total = 0;
        for (int i = 1; i <= in; i++) {
            if (i < in ) {
                System.out.print(i+"+");
            }else {
                System.out.print(i);
            }
                total += i;
        }
        
        System.out.println(" = "+total);

    }
    
}
