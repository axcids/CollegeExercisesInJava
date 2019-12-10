public class Main {
    public static void main(String[] args) {

        int integerArray[] = {1,2,3,4,5,6,7,8,9,10};
        boolean booleanArray[] = {true, false, true, false, true};
        String stringArray[] = {"Ahmed", "bader", "nasser"};
        
        for(int num: integerArray){
            System.out.print(" "+num);
        }
        System.out.println("");
        for(boolean boo: booleanArray){
            System.out.print(" "+boo);
        }
        System.out.println("");
        for(String str: stringArray){
            System.out.print(" "+str);
        }
        
 
    }
}
