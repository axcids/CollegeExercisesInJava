public class pen {
    private int id;
    private String color;
    
    public pen(){
        id = 0;
        color = "";
    }
    public pen (int id, String color){
        this.color = color;
        this.id = id;
    }
    public void setId(int newId){
        
        id = newId;
    }
    public void setColor(String newColor){
        this.color =  newColor;
    }
    public int getId(){
        return id;
    }
    public String getColor(){
        return color;
    }
    
}
