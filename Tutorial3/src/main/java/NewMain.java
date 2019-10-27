import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a word to count");
        String word = input.nextLine();
        System.out.println("The word '"+word+"' length is: "+word.length()+" letters");
        

    }
    
}
