import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        /* 
            There is two ways to save and retrieve data in collection
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