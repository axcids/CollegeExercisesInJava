
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String firstLetter;
        String secondLetter; 
        String thirdLetter; 
        String fourthLetter;
        String fifthLetter;
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fName = input.nextLine();
        firstLetter = fName.substring(0,1);
        secondLetter = Integer.toString(fName.length());
        if(fName.length() > 9){
            secondLetter = Integer.toString(Integer.parseInt(fName));
        }
        System.out.println("Enter your last Name: ");
        
        
        
        
        
        System.out.println("Enter your age: ");
        
        
        
        
        System.out.println("Enter your password ");

    }
    
}
