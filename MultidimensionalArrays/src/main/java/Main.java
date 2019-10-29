public class Main {
    public static void main(String[] args) {
        
         int[][] data = {
             {1, 2, 3},
             {4, 5, 6},
             {7, 8, 9}
         };
         
         data[1][2] = 100;
         System.out.println(data[1][2]);
    }
    
}
