import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        /* 
            There is two ways to save and retrieve data in collections
                first one: Stack
                            means first one in, last one out 
                second one: Quoe 
                            means first one in, first one out
        */
        
        LinkedList<String> names = new LinkedList<String>();
        //LinkedList is a type of quoe collection 
        names.add("Caleb");
        names.add("Sue");
        names.add("Sally");
        System.out.println(names.remove());
        System.out.println(names.remove());
        System.out.println(names.remove());       
    }
}    