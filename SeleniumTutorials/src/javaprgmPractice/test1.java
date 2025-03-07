package javaprgmPractice;

import java.util.Scanner;

// addition & multiplication from scanner class with and without return 
public class test1 {
	
	// without return
		public  void mul(int a,int b)
		{
			
			System.out.print("multiplication of a and b:"+(a*b));
	
		}
	
	// with return
	public static int Add(int a,int b)
	{
		
		System.out.println("addition of a and b:"+(a+b)); // if we don't define (a+b) we need to print in menthod with
		return a+b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fisrt number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
	System.out.println("fisrt number:"+a);
	System.out.println("second number:"+b);
		
// return type method 		
 Add(a, b); // calling directly 
 test1.Add(a, b);// calling by class name 
 
// without return type
 test1 c= new test1();
// c.Add(a, b); // by object 
 c.mul(a, b);
 //int multiple=c.mul(a, b); // if we are holding value like this or ptinting directly then we need to return it to method
 

	}

}
