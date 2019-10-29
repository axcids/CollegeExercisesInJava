
import java.util.LinkedList;

public class Main {

    static int[][] maze = {
        {2,0,1,1},
        {1,1,0,1},
        {0,1,1,1}
    };
    
    static LinkedList<Position> path = new LinkedList<Position>();
    
    public static void main(String[] args) {
        
        Position p = new Position(0, 3);
        path.push(p);
        
        //maze[path.peek().y][path.peek().x] = 0;
        int y = path.peek().y;
        int x = path.peek().x;
        maze[y][x] = 0;
        
        

    }
    
}
