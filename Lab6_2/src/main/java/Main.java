import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your grade (0-100)");
        int grade = in.nextInt();
            while (grade < 0 || grade > 100) {
                System.out.println("The grade must be between 0 and 100");
                int grade2 = in.nextInt();
                grade = grade2;
            }
            if (grade >= 60){
                System.out.println("Congratulations you have passed the class");
            }else if (grade < 60) {
               System.out.println("unfortunately, You did not pass the class");
            }
    }
}
    
