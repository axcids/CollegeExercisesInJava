
public class StudentTest {

    public static void main(String[] args) {
       StudentProfile s1 = new StudentProfile();
       StudentProfile s2 = new StudentProfile(1, "Ahmed");
       s1.display(1); s2.display(2);
       StudentProfile s3 = new StudentProfile(2, "Mohammed");
       s3.setId(3);
       s3.setName("Abdul");
       s3.display(3);
       
       
    }
    
}
