package apnaclassjava;

public class lecture17recurssion {
	
	// ----Write program from 5 to 1---//
	public static void printNumb(int n) // creating a function
	{ 
			if (n==0) {
				return;
			}
			System.out.println(n);// o/p-->54321
			printNumb(n-1); // here re-initializing parameter value of funtion printNumb and paasing it funtion.
		
		
	}
	
	
	 // public static void main(String[] args) 
	 // { int n=5;
	 // printNumb(n);//n=5
	  
	//  }
	 

// ----Write program from 1 to 5---//
	public static void printNumb1(int n1) // creating a function
	{ 
			if (n1==6) {
				return;
			}
			System.out.println(n1);// o/p-->54321
			printNumb1(n1+1); // here re-initializing parameter value of funtion printNumb and paasing it funtion.
		
		
	}
	
	//public static void main(String[] args) {
		//int n1=1;
		//printNumb1(n1);//n=1 (initaial value 1 and it will go upto 6 , once reach at 6 it will return the value to main and program end
		
//	}
	
	// ----Write program to print sum of n natural numbers---//
		public static void printSum(int i,int n2,int sum) // creating a function 
		{ 
				if (i==n2) {
					sum +=i; // here in variable sum  i ki value add ho rhi hai i.e sum = sum + i
					System.out.println(sum);
					return;
				}
				// calling 
				sum +=i; // sum = sum + i
				printSum(i+1,n2,sum);	
				//System.out.println(i);
		}
		
		//public static void main(String[] args) {// main mehtod
		//	printSum(1,5,0);
			
		//}
	
		// ----Write program to calculate the factorial of n---//
		public static int calFact(int n3) // creating a function 
		{ 
			if (n3==1 ||n3==0) {
				return 1; }
			int fact_nm1=calFact(n3-1);
			int fact_n=n3*fact_nm1;
			return fact_n;
		}
			//public static void main(String[] args) {
				//int n3=5;
				//int ans=calFact(n3);
				//System.out.println(ans);
				
			//}
			
			// ----Write program to print  the fibonacci series till nth term ---//
			public static void printFib(int a,int b,int n4) // creating a function 
			{ 
				if (n4==0) {
					return; }
				int c=a+b;
				System.out.println(c);
				printFib(b,c,n4-1);
				
			}
			public static void main(String[] args) {
			int a=0;int b=1;
			System.out.println(a);
			System.out.println(b);
			int n4=7;
			printFib(a,b,n4-2);
				//System.out.println();
				
			}
}
