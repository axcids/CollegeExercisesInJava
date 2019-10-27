public class Profile {
    private int id;
    private String name;
    
    //Constructer 1
    public Profile(){
        id = 0;
        name = "";
    }
    //Constructer 2
    public Profile(int studentId,String studentName){
        studentId = id;
        studentName = name;
    }
    //Accessor methods 
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    //Mutator methods
    public void setId(int studentId){
        id = studentId;
    }
    public void setName(String studentName){
        name = studentName;
    } 
}
