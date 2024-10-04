package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.midi.SysexMessage;

public class brushup2 
{
	
	public static void main(String[] args) 
	{
		int []arr1= {1,2,3,4,5,6,23,34,60,12}; 
		for (int i = 0; i < arr1.length; i++)
		{
			if(arr1[i] %2==0)
			{
			//	System.out.println(arr1[i]);
				//break; // to exist the loop
			}
			else{
				//System.out.println(arr1[i] + "not multiple of 2");
			}
			
			
		}
		ArrayList<String> al= new ArrayList<String>();
		al.add("rahul");
		al.add("java");
		al.add("selenium");
		System.out.println(al.get(0));
		//for loop
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("****************************");
		
		for (String st : al) 
		{
			System.out.println(st);
		}
		
		// item to check in arraylist
		System.out.println(al.contains("test"));
		// below one is normal array we can use contaion() so to it we are converting array into Arraylist
		int []arr11= {1,2,3,4,5,6};// normal array
		List<int[]> alist=Arrays.asList(arr11); // converting into arraylist
		System.out.println(alist.contains(9));// using contaion() 
		
		String [] str= {"test","password","weak"};
		List<String> strlist=Arrays.asList(str);
		System.out.println(strlist.contains("test"));
		
	}

}
