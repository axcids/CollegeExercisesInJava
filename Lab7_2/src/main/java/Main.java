
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        boolean valid = false;
        
        while (!valid){
            
            System.out.println("Enter a positive number: ");
            int in1 = input.nextInt();
            System.out.println("Enter a positive number larger than the first one: ");
            int in2 = input.nextInt();
            
            if (in1 < in2 ) {
               for (int i = in1; i <= in2; i++) {
                    total = total+i;
                    if (i < in2) {
                        System.out.print(i+" + ");
                    } else {
                        System.out.print(i);
                    }
                    valid = true;
                }
            } else {
            valid = false;
            System.out.print("Wrong entry try Again. ");
            }
        }
        System.out.print(" = "+total);
    }
    
}
