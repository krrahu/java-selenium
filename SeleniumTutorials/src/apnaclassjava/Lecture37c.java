package apnaclassjava;

import java.util.HashMap;

public class Lecture37c {

	public static void main(String[] args) {
		// question 5 --> find the itinary from tickets
		
				//int [] a= new int [4]; define lenght of aray now add values it like a[0]=7;a[1]=2;
				
				int arr[]= {10,2,-2,-20,10};
                int k=-10;
				HashMap<Integer,Integer> map=new HashMap<>();
				//map.put(key:0, value:1);// empty subarry
				map.put(0, 1);
				int ans=0;
				int sum=0;
				for (int j = 0; j < arr.length; j++) {
					sum+=arr[j];
					if (map.containsKey(sum-k)) {
						ans += map.get(sum-k);
						
					}
					if (map.containsKey(sum)) {
						map.put(sum,map.get(sum) +1);
						
					}else {
						map.put(sum,1);
					}
					
				}
				System.out.println(ans);


	}

}
