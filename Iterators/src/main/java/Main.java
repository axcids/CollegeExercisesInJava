import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<String> names = new LinkedList<String>();
        names.push("Caleb");
        names.push("Sue");
        names.push("Sally");
        
        ListIterator<String> it = names.listIterator();
        
        it.next();
        it.add("Abdul");
        
        names.add(2,"Susan");
        
        for(String s: names){
            System.out.println(s);
            
            
        }
    }
}
