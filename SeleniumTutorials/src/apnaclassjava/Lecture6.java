package apnaclassjava;

public class Lecture6 {

	public static void main(String[] args) {
		// to print 
		//*       *
		//**     **
		//***   ***
		//**** ****
		//**********
		//**********
		//**** ****
		//***   ***
		//**     **
		//*       *
		int n=5;
		// upper half
		for (int i = 1; i <=n; i++) {
			// first part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			// print space
			int space=2*(n-i);
			for (int j = 1; j <space; j++) {
				System.out.print(" ");
				
			}
			// 2nd part
			for (int j = 1; j <=i; j++) {System.out.print("*");
				
			}
			System.out.println();
		}
		
		// lower half
		// outer loop 
		for (int i = n; i >=1; i--) {
			
			// first part (inner loop first)
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			// print space (inner loop second)
			int space=2*(n-i);
			for (int j = 1; j <space; j++) {
				System.out.print(" ");
				
			}
			// 2nd part (inner loop third)
			for (int j = 1; j <=i; j++) {System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
