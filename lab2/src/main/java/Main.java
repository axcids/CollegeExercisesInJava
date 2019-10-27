
public class Main {

    public static void main(String[] args) {
        pen p1 = new pen();
        pen p2 = new pen();
        System.out.println("---------------------------");
        System.out.println("The id is: "+p1.getId()+" The name is: "+p1.getColor());
        System.out.println("---------------------------");
        System.out.println("The id is: "+p2.getId()+" The name is: "+p2.getColor());
        pen p3 = new pen(1,"red");
        p3.setId(2);
        p3.setColor("Blue");
        System.out.println("---------------------------");
        System.out.println("The id is: "+p3.getId()+" The name is: "+p3.getColor());
       
    }
    
}
