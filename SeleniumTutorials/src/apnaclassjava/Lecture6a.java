package apnaclassjava;

public class Lecture6a
{

	public static void main(String[] args) 
	{
	// print below program
	//	    *****
	//	   *****
	//	  *****
	//	 *****
	//	*****
		int n =5;
		for (int i = 1; i <=n; i++) {
			// print space
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
				
			}
			// print star
			for (int j = 1; j <=5; j++) {
				System.out.print("*");
				
			}
		System.out.println();	
		}
	//	print below start program
	//	    * 
	//	   * * 
	//	  * * * 
	//	 * * * * 
	//	* * * * * 
		int n1 =5;
		for (int i = 1; i <=n1; i++) {
			// print space
			for (int j = 1; j <=n1-i; j++) {
				System.out.print(" ");
				
			}
			// print star
			for (int j = 1; j <=i; j++) {
				System.out.print("*"+" ");// if we remove space from here 
				
			}
		System.out.println();	
		}

		// ---------print below program ---------------//
				//    1          
				//   2 2   
				//  3 3 3
				// 4 4 4 4 
		//        5 5 5 5 5 
				
	
				  int n4=5;
				   // outer loop
				   for (int i = 1; i<=n4; i++)
				    { for (int j = 1; j<=n4-i;j++) 
				    { System.out.print(" "); 
				  } 
				    for (int j =1; j<=i; j++) {
				    	System.out.print(i+" "); // if we remove space from here then check it will not in proper pyramid shape
						
					}
				    
				    System.out.println(); }
				   
					// ---------print below solid palindrome program ---------------//
		//		    1
		//		   212
		//		  32123
		//		 4321234
		//		543212345
				
				   int n5=5;
				   for (int i = 1; i <=n5; i++) {
					   // print space
					   for (int j = 1; j <=n5-i; j++) {
						   System.out.print(" ");
						
					}
					   // print first half numbers
					   for (int j = i; j>=1; j--) {
						   System.out.print(j);
						
					}
					// print second half numbers
					   for (int j =2; j<=i; j++)  // if j=1 stil it will be plaindrome
					   {
						   System.out.print(j);
						
					}
					   System.out.println();
				}
				 
		// print below pattern
	//			    *
	//			   ***
	//			  *****
	//			 *******
	//			 *******
	//			  *****
	//			   ***
	//			    *
				   
				 
					int n6 =4;
					  // upper half (outer loop)
					for (int i = 1; i <=n6; i++) {
						// print space (inner loop)
						for (int j = 1; j <=n6-i; j++) {
							System.out.print(" ");
							
						}
						// print star (inner loop)
						for (int j = 1; j <=2*i-1; j++) { //j<=i , if we put this condition then pattern will change
							System.out.print("*");
                                                      }
						System.out.println();	
					}
						// lower half (outer loop)
						for (int i = n6; i>=1; i--) {
							
							// print space ((inner loop)
							for (int j = 1; j <=n6-i; j++) {
								System.out.print(" ");
								
							}
							// print star (inner loop)
							for (int j = 1; j <=2*i-1; j++) { //j<=i , if we put this condition then pattern will change
								System.out.print("*");}
							System.out.println();	
					}
	}

}
