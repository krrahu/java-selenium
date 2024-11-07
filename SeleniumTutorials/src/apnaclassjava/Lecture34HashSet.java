package apnaclassjava;

import java.util.HashSet;
import java.util.Iterator;

public class Lecture34HashSet {

	public static void main(String[] args) {
		// creating 
		
		HashSet< Integer> set=new HashSet< Integer>();
		//Insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1); //list.add(el)
		
		//print all elements but it will be unique only no duplicates
		System.out.println(set); // dupicate values will not print
		// search
		if (set.contains(1)) {
			System.out.println("set contains 1");
			
			// size
			System.out.println(set.size());
			
		}
		if (!set.contains(6)) {
			System.out.println("set contains 6");
		}
		
// delete 
		set.remove(1);
		if (!set.contains(1)) {
			System.out.println("set does not contains 1");
		}
		// iterator
		Iterator it=set.iterator();   // iterator is a mehtod of set and  store the value on it and Iterator is type of data type
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
