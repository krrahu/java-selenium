package apnaclassjava;

import java.util.Scanner;

public class Lecture12strings {

	public static void main(String[] args) {
		// concattination of string with user input
		/*
		 * Scanner sc= new Scanner(System.in); String name=sc.nextLine(); String
		 * age=sc.nextLine(); System.out.println("my introduction is:"+ name + " "+
		 * age);
		 */
		
		// concattenation of string  with decalare value
		
String city="Bangalore";
String State ="karnataka";
String country="India";
String location=city+" "+State+","+country;
System.out.println(location);
// print lenght of all string i.e location
System.out.println(location.length());
// print char at
for (int i = 0; i <location.length(); i++) {
	System.out.println(location.charAt(i));
	
}

//  compare the string 
String food1="onion";
String food2 ="onion";
// 1. when S1>S2 : +ve value
// 2. when S1<S2 : -ve value
// 3. when S1=S2 : 0 

if (food1.compareTo(food2)==0) // here compareTo will return 0 value 
{
	System.out.println("strins are equal");
	
}else {
	System.out.println("strins are not equal");
}

//
if (food1==food2) {
	System.out.println("strins are equal");
	
}else {
	System.out.println("strins are not equal");
}

// find the sub string values 
String animal="Tiger is stronger than cat";
String t1=animal.substring(2,4);// start and end index 
String t2=animal.substring(4); // only one index
System.out.println(t1);
System.out.println(t2);
	}
	}
	


