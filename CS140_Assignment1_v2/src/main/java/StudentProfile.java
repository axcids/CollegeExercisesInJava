public class StudentProfile {
    
    private int id;
    private String name;
    
    public StudentProfile(){
        id = 0;
        name = "";
    }
    public StudentProfile(int newId, String newName){
        id = newId;
        name = newName;
    }
    public int display(int obj){
        if (name.equals("")){
            name = "NONAME";
        }
        System.out.println("----------------S"+obj+"----------------");
        System.out.println("Student ID for S"+obj+" is: " + id);
        System.out.println("Student Name for S"+obj+" is: " + name);
        
        return obj;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name; 
    }

}
