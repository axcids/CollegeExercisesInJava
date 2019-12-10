import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number of lines");
        int in = input.nextInt();
        for(int i = 1; i <= in; i++){
            System.out.println();
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
        }
    }
    
}
