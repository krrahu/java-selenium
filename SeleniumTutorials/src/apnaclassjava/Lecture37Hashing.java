package apnaclassjava;

import java.util.HashMap;

public class Lecture37Hashing {
	
	public static void majorityElement(int nums[])
	{
		// question 1 
		// Step 1
		HashMap<Integer,Integer> map=new HashMap<>();
		int n =nums.length;
		// step 2
		for (int i = 0; i < n; i++) {
			if (map.containsKey(nums[i])) { // true
				map.put(nums[i], map.get(nums[i])+1);
				
			} else { //false
				map.put(nums[i],1);
				//map.put(nums[i],value:1);// not working with this

			}
			
		}
		// step 3
		for (int key : map.keySet()) {
			if (map.get(key)>n/3) {
				System.out.println(key);
				
			}
			
		}
	}

	public static void main(String[] args) {
		//
		
		int nums1[]= {1,3,2,5,1,3,1,5,1};//
		majorityElement(nums1);
		
		System.out.println( " output of n=1,2");
         int nums[]= {1,2};//
        majorityElement(nums);
		
		
		
		

	}

}
