import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 
            There is two ways to save and retrieve data in collections
                first one: Stack
                            means first one in, last one out 
                second one: Quoe 
                            means first one in, first one out
        */
        
        LinkedList<String> names = new LinkedList<String>();
        names.push("Caleb");
        names.push("Sue");
        names.push("Sally");
        
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
    }
    
}
