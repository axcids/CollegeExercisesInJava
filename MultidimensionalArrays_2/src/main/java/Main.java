public class Main {
    public static void main(String[] args) {
        
         int[][] data = {
             {1, 2, 3},
             {4, 5, 6},
             {7, 8, 9}
         };
         
         //I figured how many rows are there by using .length method on the whole two-dim array 
         System.out.println("There are  "+data.length+" rows");
         //I figured how many columns by using .length method on one specific row 
         System.out.println("There are "+data[0].length+" cloumns");
         System.out.println("\n");
         
         for (int i = 0; i < data.length; i++){
             for (int j = 0; j < data[i].length; j++){
                 System.out.print(data[i][j]+" ");
             }
             System.out.println();
         }
         
         
    }
    
}
