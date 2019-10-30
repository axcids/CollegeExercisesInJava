
import java.util.LinkedList;

public class Main {

    static int[][] maze = {
    //        0 1 2 3 4 5 6 7 8 9 A B 
    /*0*/    {1,0,0,0,0,0,0,0,0,0,0,0},
    /*1*/    {1,1,1,0,1,0,1,0,1,0,1,1},
    /*2*/    {0,1,1,1,0,1,0,1,0,1,1,1},
    /*3*/    {0,0,0,1,0,1,1,1,0,1,1,1},
    /*4*/    {1,1,1,1,1,1,1,1,1,1,1,1},
    /*5*/    {0,0,1,1,0,0,1,0,0,1,0,1},
    /*6*/    {1,1,0,1,1,0,0,0,0,1,1,2},
    };
    
    static LinkedList<Position> path = new LinkedList<Position>();
    
    public static boolean isValid(int y, int x){
        if(y < 0 || y >= maze.length || x < 0 || x >= maze[y].length){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Position p = new Position(0, 0);
        path.push(p);
        
          
        
        while (true){
            //maze[path.peek().y][path.peek().x] = 0;
            int y = path.peek().y;
            int x = path.peek().x;
            maze[y][x] = 0;  
            
            //down
            if (isValid(y+1, x)){
              if(maze[y+1][x] == 2){
                    System.out.println("Moved down, then you Won!!!");
                    return;
                }else if(maze[y+1][x] == 1){
                            System.out.println("Moved down");
                            path.push(new Position(y+1, x));
                            continue;
                        }  
            }
            
            //left
            if(isValid(y, x-1)){
                if(maze[y][x-1] == 2){
                    System.out.println("Moved left, then you Won!!!");
                    return;
                }else if(maze[y][x-1] == 1){
                            System.out.println("Moved left");
                            path.push(new Position(y, x-1));
                            continue;
                        }    
            }
            
            //up
            if(isValid(y-1, x)){
                if(maze[y-1][x] == 2){
                    System.out.println("Moved up, then you Won!!!");
                    return;
                }else if(maze[y-1][x] == 1){
                            System.out.println("Moved up");
                            path.push(new Position(y-1, x));
                            continue;
                        }   
            }
            
            //right
            if(isValid(y, x+1)){
                if(maze[y][x+1] == 2){
                    System.out.println("Moved right, then you Won!!!");
                    return;
                }else if(maze[y][x+1] == 1){
                            System.out.println("Moved right");
                            path.push(new Position(y, x+1));
                            continue;
                        }   
            }
            
            path.pop();
            System.out.println("Moved Back");
            if (path.size() <= 0 ){
                System.out.println("No Path");
                return;
            }
        }
    }
    
}
