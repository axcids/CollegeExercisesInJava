public class StudentTest {
    public static void main(String[] args) {
        Profile S1 = new Profile();
        Profile S2 = new Profile();
        Profile S3 = new Profile();
                
        //First profile:
        System.out.println("--------First profile(S1)--------"+
                "\n"+
                "Student ID: "+S1.getId()+
                "\n"+
                "Student Name: "+S1.getName()
                );
        
        //Second Profile:
        System.out.println("--------Second profile(S2)--------"+
                "\n"+
                "Student ID: "+S2.getId()+
                "\n"+
                "Student Name: "+S2.getName()
                );
        
        //Third profile: 
            S3.setId(170362306);
            S3.setName("Abdulmajeed");
        System.out.println("--------Third profile(S3)--------"+
                "\n"+
                "Student ID: "+S3.getId()+
                "\n"+
                "Student name: "+S3.getName()
                );
    }    
}
