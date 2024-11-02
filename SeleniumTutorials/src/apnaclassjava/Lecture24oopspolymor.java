package apnaclassjava;

 class Student
{
	
	 String name;
	 int age;
	 public void printinfo() 
	 {
		 System.out.println();
	 }
		
	 
	 public void printinfo(String name) 
	 {
		 System.out.println(name);
	 }
		
	 public void printinfo(int age) // if we put here String name instaed int age we will Complie time error
	 {System.out.println(age);
	 }
	 public void printinfo(String name, int age) // 
	 {System.out.println(name+""+ age);
	 }
}
public class Lecture24oopspolymor {

	public static void main(String[] args) {
		Student S1=new Student();
		S1.name="Test"; // here we are defining the value and this value is than passed to called funtion i.e printinfo 
		S1.age=22;
		S1.printinfo(S1.name,S1.age);// here we are passing  the defining the value to called funtion i.e printinfo(String name, int age)
		

	}

}
