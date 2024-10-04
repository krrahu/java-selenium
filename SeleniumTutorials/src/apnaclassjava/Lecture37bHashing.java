package apnaclassjava;

import java.util.HashMap;
import java.util.HashSet;

public class Lecture37bHashing {
	
	// question 4 --> find the itinary from tickets 
	public static String getStrat(HashMap<String,String> tick)
	
	{
		HashMap<String,String> revMap=new HashMap<>();
		for (String key : tick.keySet()) {
			revMap.put(tick.get(key), key);
			
		}
		for (String key : tick.keySet()) {
		if (!revMap.containsKey(key)) {
			return key;	
		}
			
		}
		return null;
		
	}

	public static void main(String[] args) {
		// question 4 --> find the itinary from tickets 
		HashMap<String,String> tickets=new HashMap<>();
		//tickets.put(key:"chennai",value:"bang");// --> why it's throing error 
		tickets.put("chennai","bang");
		tickets.put("Mumbai", "delhi");
		tickets.put("goa", "chennai");
		tickets.put("delhi", "goa");
		String start=getStrat(tickets);
		while (tickets.containsKey(start)) {
			System.out.print(start +"-->");
			start=tickets.get(start);
			
		}
		System.out.println(start); 
		
		
	}

}
