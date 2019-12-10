public class Main {
    public static void main(String[] args) {

        int integerArray[] = {100,200,300,400,500,600,700,800,900,1000};
        for (int show1 : integerArray){
            System.out.print(" "+show1);
        }
        System.out.println("");
        integerArray[0] = 11;
        for (int show2 : integerArray){
            System.out.print(" "+show2);
        }
        System.out.println("");
        integerArray[9] = 001;
        for (int show3 : integerArray){
            System.out.print(" "+show3);
        }
        

    }
    
}
