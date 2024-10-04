package apnaclassjava;

import java.util.Scanner;

public class Lecture5 {

	public static void main(String[] args) {
		// print the pattern
		
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		
		// above star program with fixed input i.e constant value with pre-defined
		/*
		 * int n=4; int m=5;
		 * 
		 * for (int i = 0; i <n; i++) {
		 * 
		 * for (int j = 0; j <m; j++) { System.out.print("*"+" ");
		 * 
		 * }
		 * 
		 * System.out.println(); }
		 */
		
		// above star program with user input i.e dynamic
		/*
		 * Scanner sc=new Scanner(System.in); int n1=sc.nextInt(); int m1=sc.nextInt();
		 * for (int i = 0; i <n1; i++) {
		 * 
		 * for (int j = 0; j <m1; j++) { System.out.print("*"+" ");
		 * 
		 * }
		 * 
		 * System.out.println(); }
		 */

// ---------below star program with user input i.e dynamic---------------//
		//* * * * *
		//*       *
		//*       *
		//* * * * *
		
		/*
		 * int n=4; int m=5; 
		 * // outer loop
		 *  for (int i = 1; i <=n; i++)
		 *  { 
		 *  // inner loop
		 * for (int j = 1; j <=m; j++) { 
		 * //now check cell value -->( i,j) 
		 * if (i==1 ||j==1 ||i==n || j==m) { System.out.print("*"); } 
		 * else
		 * {System.out.print(" ");
		 * 
		 * }
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */
		
		// ---------print below star program with user input i.e dynamic---------------//
				//* 
				//* *   
				//* * *
				//* * * * 
				
		/*
		 * int n1=4; 
		 // outer loop
		 * for (int i = 0; i <n1; i++) 
		 // inner loop
		 * { for (int j = 0; j <=i; j++)
		 *  {
		 * System.out.print("*");
		 * 
		 * }
		 * 
		 * System.out.println(); }
		 */
				
				// ---------print below star program with user input i.e dynamic---------------//
				//* * * *
				//* * * 
				//* * 
				//* 
				
				
				/*
				 int n2=4; 
				 for (int i = n2; i >=1; i--) 
				 { for (int j = 1; j <=i; j++)
				  { System.out.print("*"); }
				 
				  System.out.println(); 
				  }
				 */
		

		// ---------print below star program with user input i.e dynamic---------------//
		//     *
		//   * *
		// * * * 
		//* * * *
			
		/*
		 * int n3=4; 
		 * // outer loop 
		 * for (int i = 1; i<=n3; i++) 
		 * // inner loop to print space
		 *  { for (int j = 1; j <=n3-i; j++)
		 * 
		 * { System.out.print(" ");
		 * 
		 * } // inner loop to print start
		 *  for (int j = 1; j<=i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		
		// ---------print below program with user input i.e dynamic---------------//
		//1          
		//1 2   
		//1 2 3
		//1 2 3 4 
		
		
		/*
		 * int n4=4;
		 *  // outer loop
		 *  for (int i = 1; i <=n4; i++)
		 *   { for (int j = 1; j <=i;j++) 
		 *   { System.out.print(j); // instaed j if we give 1 it will print like 1,11,222,333,4444
		 * 
		 * } System.out.println(); }
		 */
		
		// ---------print below program with user input i.e dynamic---------------//
				//1 2 3 4 5      
				//1 2 3 4
				//1 2 3
				//1 2  
		       // 1
		/*
		 * int m=5; 
		 * for (int i = 1; i <=m; i++)
		 *  { for (int j = 1; j <= m-i+1; j++) 
		 *  {
		 * System.out.print(j);
		 * 
		 * } System.out.println(); }
		 */
		
		// ---------print below program with user input i.e dynamic---------------//
		//1      
		//2 3 
		//4 5 6
		//7 8 9 10
       // 11 12 13 14 15 
		int n6=5;
		int number=1;
		// outer loop
		for (int j = 1; j <=n6; j++)
		{
			// inner loop
			for (int j2 =1; j2<=j; j2++) {
			 System.out.print(number+ " ");
				number++;
				
			}
			System.out.println();
		}
		// ---------print below program with user input i.e dynamic---------------//
				//1      
				//0 1 
				//1 0 1
				//0 1 0 1
		       // 1 0 1 0 1 
		
		int n7=5;
		// outer loop
		for (int i = 1; i <=n7; i++) {
			for (int j = 1; j <=i; j++) {
				int sum=i+j;
				if (sum%2==0) {//even number
					System.out.print("1 ");
				}
				else { // odd number
					System.out.print("0 ");
				}	
			}
			System.out.println();
		}
		
	}

}
