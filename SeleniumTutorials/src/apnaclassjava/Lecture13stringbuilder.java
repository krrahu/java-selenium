package apnaclassjava;

import java.util.Scanner;

public class Lecture13stringbuilder {

	public static void main(String[] args) {
		// 
		//Scanner sc= new Scanner(System.in);
		StringBuilder sb= new StringBuilder("Tony"); //--> o/p=Tony
		System.out.println(sb);
		
		// find char at index 0
		System.out.println(sb.charAt(0));//--> o/p=T
		
		//set char at index 0
		sb.setCharAt(0,'P');
		System.out.println(sb); //--> o/p=Pony
		// insert value T at index 0
		sb.insert(0, 'T');
		System.out.println(sb); //--> o/p=TPony
		
		// delete value P from TPony 
		sb.delete(1, 2);
		System.out.println(sb); //--> o/p=Tony
		
		//------------------ Append funtion------------------//
		StringBuilder sb1= new StringBuilder("H"); //
		sb1.append("e");
		sb1.append("l");
		sb1.append("l");
		sb1.append("o");
		System.out.println(sb1);
		
		// ---------reverse the string with StringBuilder--------------------// 
		StringBuilder sb2=new StringBuilder("Hello");
		for (int i = 0; i < sb2.length()/2; i++) {
			int front=i;
			int back=sb2.length()-i-1;
			
			// find character 
			char frontchar=sb2.charAt(front);
			char backchar=sb2.charAt(back);
			
			sb2.setCharAt(front, backchar);
			sb2.setCharAt(back, frontchar);
			
		}
		System.out.println(sb2);
		

	}

}
