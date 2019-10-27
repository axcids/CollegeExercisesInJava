
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        //First Letter
        String firstName = input.nextLine();
        String firstLetter = firstName.substring(0,1);
        //Second Letter
        String secondLetter;
        if (firstName.length() > 9){
            secondLetter = Integer.toString(firstName.length()).substring(0,1);
        } else {
            secondLetter = Integer.toString(firstName.length());
        }
        //Third Letter
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        String thirdLetter = lastName.substring(lastName.length()-1);
        //Fourth Letter 
        String fourthLetter;
        if (lastName.length() > 9){
            fourthLetter = lastName.substring(0,1);
        } else {
            fourthLetter = Integer.toString(lastName.length());
        }
        //fivth Letter
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        int x = age%9;
        String fivthLetter = Integer.toString(x);
        
        //Result
        
        System.out.println("What do you think your password will look like?");
        String userGuess = input.nextLine();
        String Password = firstLetter+secondLetter+thirdLetter+fourthLetter+fivthLetter;
        if (userGuess.equalsIgnoreCase(Password)){
        
                System.out.println("Welcome Mr."+lastName+" your password '"+userGuess+"' is correct");
                System.out.println("You have entered: "+userGuess +"\n Your Actual password is: "+Password.toLowerCase());               
        } else {
            System.out.println("Wrong Password!");
            System.out.println("You have entered: "+userGuess +"\n Your Actual password is: "+Password.toLowerCase());   
        }
    }
    
}
