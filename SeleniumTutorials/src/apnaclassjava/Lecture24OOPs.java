package apnaclassjava;

 class Pen{
	 String colour;
	 String type;
	 
	 public void write() 
	 {
		 System.out.println("write something");
	 }
	public void printcolur()
	{
		System.out.println(this.colour);//This will tell whih objetc is accessing 
	}
 }	
	class Student
   {
		 String name;
		 int age;
		 
		 public void printinfo() 
		 {
			 System.out.println(this.name);
			 System.out.println(this.age);
		 }
		 Student()// constructor
		 {
		System.out.println("this non paramter construtor");
		}	
		 
		 Student(String name, int age)// parameterized constructor
		 {
			 this.name=name;
			 this.age=age;
		System.out.println("this  paramter construtor");
		}
}

public class Lecture24OOPs {

	public static void main(String[] args) {
		//  accesing variable and funtions of class  pen 
		
		  Pen p1 =new Pen();
		  p1.colour="black"; p1.type="gel"; 
		  p1.write();
		  p1.printcolur();
		  
		  Pen p2 =new Pen(); 
		  p2.colour="green"; p2.type="ball";
		  p2.printcolur();
		 
		  
		  // accesing variable and funtions of class student 
		Student s1 =new Student();
		s1.name="test";
		s1.age=12;
		Student s2 =new Student("calling para constructor",9); // para constructor
		s2.printinfo();
		s1.printinfo();
		
	

	}

}
