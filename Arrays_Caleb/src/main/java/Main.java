import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size for the array: ");
        int size = in.nextInt();
        
        int grades[] = new int[size];
        
        System.out.println("Enter "+size+" numbers:");
        for (int i = 0; i  < size; i++){
            grades[i] = in.nextInt();
        }
        in.close();
        for (int i = 0; i  < size; i++){
            System.out.println("Grade "+(i+1)+" is: "+grades[i]);
        }
      
    }
}
