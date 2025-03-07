package javaprgmPractice;

import java.util.Arrays;

public class test {
	
// // highest  and second highest  number
	public static void main(String[] args) {

		int arr[]= {1,3,5,8,9,2,6,7};
		int sizeofArray=arr.length;
		System.out.println(sizeofArray);
		//int sortedarray= 
				Arrays.sort(arr);
			//	Arrays.toString(arr);
			/*
			 * When we need to print or log the contents of a primitive array, we use
			 * Arrays. toString() method that converts a primitive array into a string
			 * representation
			 */
				System.out.println(Arrays.toString(arr));
				System.out.println(arr[6]);// at index 6	
				
				//System.out.println(arr[sizeofArray-1]); // highest 
				//System.out.println(arr[sizeofArray-2]); // 2nd highest
				
				
				  int i=1; 
				  
				  for (int x = sizeofArray-i; x < arr.length; x++) 
				  {
					  
				  System.out.println(arr[sizeofArray-i]);
				 
				
				  
				  }
				 
		
		

	}

}
