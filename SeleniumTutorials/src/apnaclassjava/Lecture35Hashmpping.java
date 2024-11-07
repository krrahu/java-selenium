package apnaclassjava;

import java.util.HashMap;
import java.util.Map;

import org.zeromq.ZStar.Set;

public class Lecture35Hashmpping {

	public static void main(String[] args) {
		// HashMap is key value pair , country(key), popuation (value)
		HashMap <String,Integer> map= new HashMap<>();
		
		// insertaion (key,value)
		map.put("india", 100);
		map.put("china", 230);
		map.put("USA", 900);
		System.out.println(map);
		
		map.put("USA", 1900);
		System.out.println(map);
		
		// search
		if (map.containsKey("india")) {
			System.out.println("key is present in map");
			
		}else {
			System.out.println("key is not present in map");
		}
		
		System.out.println(map.get("china")); //if key exist in map it will return the value 
		System.out.println(map.get("russia")); //if key not exist in map it will return null value 

		// loop
		int arr[]= {1,5,10};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
}
		System.out.println();
		
		for (int i : arr) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		
		// for (int i : arr)
		for (Map.Entry<String,Integer>e: map.entrySet()) 
// map.entrySet()  is a collection and Map.Entry <> is data type  and e is reference where we are keeping  both key and value pair 
//map.entrySet()-->  where we are converting  map into set version (key,value) and storing it in reference  e
		{
			//System.out.println(e.getKey()+ " " + e.getValue());// same line 
			System.out.println(e.getKey());	
			System.out.println(e.getValue());	
			
		}
		// by using set 
		/*Set <String>Keys=map.keySet();
		for (String key : Keys) {
			System.out.println(key+" "+ map.get(key));}*/
			
			// remove key from hashmap list
			map.remove("china");
			System.out.println(map);
			
		
		
		
	}

}
