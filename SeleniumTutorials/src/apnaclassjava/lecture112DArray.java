package apnaclassjava;

import java.util.Scanner;

public class lecture112DArray {

	public static void main(String[] args) throws InterruptedException  {
		//When the user take input and print the output , see below program:-
		
				Scanner sc= new Scanner(System.in);
				int row=sc.nextInt();
				int column=sc.nextInt();
				Thread.sleep(2000);
				int numb[][]=new int [row][column]; // defining 2D Array
				
				//input 
				// row (outer loop)
				for (int i = 0; i <row;i++) {
					// column (inner loop)
					Thread.sleep(2000);
					for (int j = 0; j <column; j++) {
						
						numb[i][j]=sc.nextInt();
					}
					Thread.sleep(2000);	
				}
				//output 
				for (int i = 0; i <row; i++) {
					Thread.sleep(2000);
					for (int j = 0; j <column; j++) {
						System.out.print(numb[i][j] + " ");
					}
					Thread.sleep(2000);
					System.out.println();
					Thread.sleep(2000);
				}

	}

}
