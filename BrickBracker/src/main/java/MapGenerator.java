
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;


public class MapGenerator {
    //Creating 2D Array
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    
//Creating MapGenerator Constructor  
//This map Generator will as a map for the game to detect the bricks places
    public MapGenerator(int row, int col){ //Parameter tells us how many row and columns for the bricks
        //Instantiating 2D Array
        map = new int [row][col];
        //#######################
        for(int i = 0; i < map.length; i++){
            //Trading through columns ----> Learn more the fix this comment 
            for(int j = 0; j < map[0].length; j++){
                //Creating the intersection mechanisim for the ball with bricks
                map[i][j] = 1;//So bricks value is one if they are not intersected with the ball, but after intersection it will change to zero
                                //Also the value 1 will be the place where the bricks will placed on  
            }
        }
        //Giving the width and height of bricks values inside the constructor
        //So every time we use this constructor the values will be same
        //And every time we restart the game the bricks will have the same values 
        brickWidth = 540/col;
        brickHeight = 150/row;
    }
    //Creating a method (function) to draw the bricks in the places assigned in the above constructor
    public void draw(Graphics2D g){
         for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                //Creating if statement to check if the spot is assigned for brick building
                if(map[i][j] > 0){
                    //Graphing the brick
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                    
                    //Creating a border around each brick 
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);//We chose black because the background black
                    //Now create the rectangle
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        } 
    }
    //To make the ball intersects with brick we need to change the value of the bricks to Zero
    //First we need to create a function
    public void setBrickValue(int value, int row, int col){
        //Second will will change the value of the Array map to the variable value 
        map[row][col] = value;//
    }
}
