package apnaclassjava;

import java.util.Scanner;

public class Lecture4

{
	public static void main(String[] args) throws InterruptedException {
	// for loop
		//for (int i = 0; i < 10; i++) {
			//System.out.println("hello");
			//System.out.println(i);
			//System.out.print(i+" ");
			
		//}
		
	
		// while loop
		/*
		 * int y = 2; 
		 * while (y<10) { System.out.println("while loop is now executing"+
		 * " "+ y); y=y+1; //y++;
		 * 
		 * }
		 */
		
		/*
		 * // do while loop int z=0; do {
		 * System.out.println("do while loop is now executing"+" "+z); z=z+1;
		 * }while(z<11);
		 */
		
		
		// print sum of first n natural number 
		//n=6
	
		
		  int sum1 =0; for (int x = 0; x < 6; x++) { sum1=sum1 + x;
		  
		  } System.out.println(sum1);
		 
				
				// print sum of first n natural number from user input i.e scenaeer class
				
				Scanner sc= new Scanner(System.in);
				int n=sc.nextInt(); // user input will store in variable n
				
				 int sum =0; // initialization and declaration of sum variable
				 for (int b = 0; b < n; b++) 
				 { sum=sum + b;
				 
				  } System.out.println(sum);
				
	}
	

}
