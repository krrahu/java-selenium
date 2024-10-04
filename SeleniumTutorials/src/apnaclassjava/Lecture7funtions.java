package apnaclassjava;

import java.util.Scanner;
//-------------------------------------------------------------------------------//
//public class Lecture7funtions {
	//public static void printMyName(String name) // creating funtion
	//{
	//	System.out.println(name);
		//return;}

	//public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		//String name=sc.next();
		//printMyName(name);

	//}
	//-----------------------------------funtion for calculation of 2 numbers--------------------------------------------//	
	/*public class Lecture7funtions {
		public static int calculateSum(int a,int b) // creating funtion
		{
		int sum =a+b;
		return sum;
		}
	
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int sum =calculateSum(a,b);
		System.out.println("sum of two numbers:"+ sum);
	
		}*/
		//-----------------------------------funtion for product of 2 numbers--------------------------------------------//	
		/*public class Lecture7funtions {
			public static int calculateProduct(int a,int b) // creating funtion
			{
			int pro =a*b;
			return pro;
			//return a*b; // can done like also
			}
		
			public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int product =calculateProduct(a,b);
			System.out.println("sum of two numbers:"+ product);
		
			}*/
//-----------------------------------funtion for factorial  of n numbers--------------------------------------------//	

			public class Lecture7funtions {
				//static int n=5; //( defined like this when no need user input)
				public static int printFactorial(int n) // creating funtion
				{
					
					  if (n<0) 
					  { System.out.println("invalid number"); 
					  return n; }
					 
				int factorial=1;
				for (int i =n; i>=1; i--) {
					factorial=i*factorial;
					
				}
				System.out.println(factorial);
				return factorial;
				}

				public static void main(String[] args) {
				Scanner sc= new Scanner(System.in);
				int n=sc.nextInt();
				printFactorial(n);

				}
}
