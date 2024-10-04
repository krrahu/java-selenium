package apnaclassjava;


import java.util.HashSet;

public class Lecture37aHashing {
	
	// question 2 --> union   
	public static int union(int arr1[],int arr2[])
	{
		HashSet<Integer> set=new HashSet<>();
		
		// adding data of arr1[] in hashset
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
			
		}
		// // adding data of arr2[] in hashset
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
			
		}
		
		// print value set 
            System.out.print(set);

return set.size();
}
	// question 2 --> intersection  i.e value which are common in two different array 
	public static int intersection(int arr1[],int arr2[])
	{
		HashSet<Integer> set=new HashSet<>();
		int count =0;
		
		// adding data of arr1[] in hashset
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
			
		}
// now here it's chcking vaule of arr2[] in hasgset  if value of arr2 present in set than count will increase by 1 or will remove the value from array2 
		for (int j = 0; j < arr2.length; j++) {
			if (set.contains(arr2[j])) {
				count++;
				set.remove(arr2[j]);
				
			}
			
		}
		
		// print value set 
          //  System.out.print(set);

return count;
}
	

	public static void main(String[] args) {
		// 
int arr1[]= {7,3,9};
int arr2[]= {6,3,9,2,9,4};
System.out.println(union(arr1,arr2)); //--> for union 
System.out.println(intersection(arr1,arr2)); //--> for intersection 

	}

}
