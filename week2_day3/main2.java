package week2_day3;

class Student{
	String name ;
	int age ;
	String department ; 
	
	public Student() {
		name = "Unknown";
		age = 20 ; 
		department = "Unassigned";
		
		System.out.println("Constructor 1 ");
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
	}
	
	public Student(String name , int age) {
		this.name = name ; 
		this.age = age ;
		department = "IT";
		
		System.out.println("Constructor 2 ");
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
	}
	
	public Student(String name , int age , String department) {
		this.name = name ; 
		this.age = age ;
		this.department = department ; 
		
		System.out.println("Constructor 3 ");
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
	}
}

public class main2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Piyansu Saha" , 21);
		Student s3 = new Student("Joy Ghosh" , 21 , "CSE");
		
		
	}

}
