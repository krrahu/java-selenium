package apnaclassjava;

import java.util.ArrayList;
import java.util.Collections;

public class Lecture25ArrayList {

	public static void main(String[] args) {
		
		
	//	ArrayList<Integer> list= new ArrayList<Integer>();
		ArrayList<Integer> list= new ArrayList<>();
		
		// Add element in arraylist
		list.add(12);
		list.add(13);
		list.add(15);
		System.out.println(list);
		
		// Get element from arraylist as per index 
		int element =list.get(0);
		System.out.println(element);
		
		// Add new element in existing arraylist as per index 
		 list.add(0,6); // here adding new element i.e 6 at index 0 i.e first postion
		System.out.println(list);
		
// set element is updatig  existing value with new value in arraylist as per index 
		 list.set(2,11); // here we updating value of index 2 with  new element i.e value
			System.out.println(list);
			
			// delete element
			list.remove(3);
			System.out.println(list);
			
			// find the size of arraylist
			int size=list.size();
			System.out.println(size);
			
			// loop
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
				
			}
			System.out.println();
			
			// sorting
			Collections.sort(list);
			System.out.println(list);
	
	}
}
