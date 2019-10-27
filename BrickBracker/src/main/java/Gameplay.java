import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;


public class Gameplay extends JPanel implements KeyListener, ActionListener{
    
    // Setting the dependencies
    
    //To not let the game start automaticly 
    private boolean play = false;
    //Setting the starting score to zero
    private int score = 0;
    //Setting the number of bricks at the beginning of the game
    private int totalBricks = 21;
    //Creating a new Timer object
    private Timer timer;
    //Speed of timer --> Learn more then fix this Comment
    private int delay = 8;
    
//X-axis and y-axis of the slider bar and ball 
    
    //Starting position of the slider (Paddle)
    private int playerX = 310; //--------Q1---------> Where is the value of Y?
    //Starting position of the ball (X and Y)
    private int ballposX = 120;
    private int ballposY = 350;
    //Setting the ball direction (X and Y)
    private int ballXdir = -1;
    private int ballYdir = -2;
    
//Creating an object for the MapGenerator class
    //So, first create a variabgle for it and we will call it map 
    private MapGenerator map;//Now I will go inside the Gameplay constructor then I will creat the object of MapGenerator
    
    
    
//Building the constractor for the gamePlay object in main method
    public Gameplay(){
        // This is the object of the class MapGenerator 
        map = new MapGenerator(3, 7);//Parameter values are (row, col)
        //Adding KeyListener
        addKeyListener(this);
        //########### --> Learn more the fix this comment
        setFocusable(true);
        //########### --> Learn more the fix this comment
        setFocusTraversalKeysEnabled(false);
        //Setting up the timer object
        timer = new Timer(delay,this); //Object parameter (speed, context) -- > Learn more then fix this comment
        //Starting the timer 
        timer.start();
        
    }
//Creating the game Map
    public void paint(Graphics g){
        //Adding (Drawing) background 
        g.setColor(Color.black); //Everything we draw we need to set its color first 
        //Adding the background's rectangle
        g.fillRect(1, 1, 692, 592); //Object Parameter (x, y, width, height)
        
        //Drawing the Map and the bricks uby calling draw function in class MapGenerator
        map.draw((Graphics2D)g);
        
        //Drawing borders for the background
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 592); // Left Side of the border
        g.fillRect(0, 0, 692, 3); //Upper Side of the border
        g.fillRect(691, 0, 3, 592); //Right Side of the border
        
        //Adding and Drawing the Score
        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString(""+score, 590, 30);
        
        //Drawing the paddle
        g.setColor(Color.green);
        g.fillRect(playerX, 550, 100, 8); //-----A1------> This is the Y value.
        
        //Drawing the ball 
        g.setColor(Color.yellow);
        g.fillOval(ballposX, ballposY, 20, 20); 
        
        //Setting up the ending of the Game
        
        //When you win ----->
        if (totalBricks <= 0){
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(Color.green);
            g.setFont(new Font("serif", Font.BOLD, 45));
            g.drawString ("You Won ", 260, 300);
            
            g.setFont(new Font("serif", Font.BOLD, 25));
            g.drawString ("Press Enter to restart the game", 170, 350);
            }
            
        //When you lose -----> 
        if (ballposY > 570){
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g.setColor(Color.red);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString ("Game Over, Score is "+score, 190, 300);
            
            g.setFont(new Font("serif", Font.BOLD, 25));
            g.drawString ("Press Enter to restart the game", 170, 350);
            
        }
        
        g.dispose();
        
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
    //Calling the timer (speed) to start when we execute the first movement
        timer.start();
    //Creating an intersection between the ball and the paddle
        if(play){ //If play = true then --->
            if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))){
                ballYdir = -ballYdir;
            }
    //Creating an intersection between the ball and the bricks 
    A:  for(int i = 0; i  < map.map.length; i++){
            for(int j = 0; j < map.map[0].length; j++){
                if(map.map[i][j] > 0){//then detect the intersection 
                    int brickX = j * map.brickWidth + 80;
                    int brickY = i * map.brickHeight + 50;
                    int brickWidth = map.brickWidth;
                    int brickHeight = map.brickHeight;
                    //Creating a rectangle around the brick 
                    //This rectangle will as  a [SENSOR] for the intersection 
                    Rectangle rect = new Rectangle(brickX, brickY,brickWidth, brickHeight);
                    Rectangle ballRect = new Rectangle(ballposX, ballposY, 20,20);
                    Rectangle brickRect = rect;
                    
                    if(ballRect.intersects(brickRect)){
                        map.setBrickValue(0, i, j);
                        totalBricks--;
                        score += 5;
                        
                        if(ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width){
                            ballXdir = -ballXdir;
                        }else{
                            ballYdir = -ballYdir;
                        }
                        
                        break A;
                    }
                }
            }
        }
    //Creating the movement of the ball 
        if(play){   //If play = true then --->
            ballposX += ballXdir; //X-axis - ballXdir (-1)
            ballposY += ballYdir; //Y-axis - ballYdir (-2)
                //Limiting ball movement within the frame
                if(ballposX < 0){ //Limiting ball movement towards left border 
                    ballXdir = -ballXdir;
                }
                if(ballposY < 0){ //Limiting ball movement toward upper border
                    ballYdir = -ballYdir;
                }
                if(ballposX > 670){ //Limiting ball movement towards right border
                    ballXdir = -ballXdir;
                }
        }
    //Redrawing the game with new values each time we move the paddle and each time ball moves
        repaint();
        }
    }
    
    //We don't need these two methods but thier existence is required
    @Override
    public void keyTyped(KeyEvent arg0) {}
    @Override
    public void keyReleased(KeyEvent arg0) {}
    
    //Setting up the paddle movement with KeyPressed method
    
    //Creating a methods to move th paddle within the game's frame
    public void moveRight(){
        play = true;
        playerX += 20;
    }
    public void moveLeft(){
        play = true;
        playerX -= 20;
    }
    //The method below responsible for function of Keystroking
    @Override
    public void keyPressed(KeyEvent e) {
        //Assigning the method e to the Right Arrow keystroke
        //So, if the Right Arrown is pressed, -->
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            // <-- don't make it go futher than 600.
            if(playerX >= 600){ //-------Q2-------> Why 600?
                //Limiting paddle (playerX) movement towards the right direction 
                playerX = 600;
            }else{
                moveRight();
            }
        }
        //Assigning the KeyEvent e to the Left Arrow keystroke
        //Or if the Right Arrown is pressed, -->
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            // <-- don't make it go less than 10.
            if(playerX < 10){
                //limiting paddle (playerX) movement towards the right direction
                playerX = 10;
            }else{
                moveLeft();
            }
        }
        //Assigning Enter key to Restart Function
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            if(!play){
                play=true ;
                ballposX = 120;
                ballposY = 350;
                ballXdir = -1; 
                ballYdir = -2;
                playerX = 310;
                score = 0;
                totalBricks = 21;
                map = new MapGenerator(3, 7);
                repaint();
            }
        }
        
    }

    
}
