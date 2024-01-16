package week1_day4;

public class student {
	String StudName;
    int StudId;
    
    public student() {
    	StudId = 100 ; 
    	StudName = "Piyansu"; 
    	System.out.println("Student id is : "+StudId);
    	System.out.println("Student name is : "+StudName);
    }
    
    public static void main(String arrgs[]) {
    	student s1 = new student();
    }
}

