package apnaclassjava;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lecture10 {

	public static void main(String[] args) {
		// array syntax--> type []arrayName=new type[size;] --> type is data type
		
		//--print marks of 3 subject without loop--//
		//int marks []  =new int[3];           // array can declare like this also
		int [] marks =new int[3];
		marks[0]=10; //phy
		marks[1]=15; //chem
		marks[2]=18; //math
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		//--print marks of 3 subject with loop
		for (int i = 0; i <3; i++) {
			System.out.println(marks[i]);
			
		}
		//print marks of 5 subject when values definine in array it self
		int [] marks2 =  {30,45,58,77,90};
		for (int i = 0; i <5; i++) {
			System.out.println(marks2[i]);
			
		}
		
		// when user give the iputs
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();// nextInt() is a method of scanner class we are calling it to take user input value and store it in reference varilave name size
		int numbers[]=new int [size];
		for (int i = 0; i <size; i++) {
			System.out.println(numbers[i]);
			
		}
		//When the user take input and print the output , see below program:-
		Scanner sc1= new Scanner(System.in);
		int size1=sc.nextInt();
		int numb1[]=new int [size1];
		//input 
		for (int i = 0; i <size1;i++) {
			numb1[i]=sc.nextInt();
		}
		//output 
		for (int i = 0; i <size1; i++) {
			System.out.println(numb1[i]);
		}
		
		//When the user take inputs in a array and search a number present in Array or not
				Scanner sc2= new Scanner(System.in);
				int size2=sc2.nextInt();
				int numb2[]=new int [size2];
				//input 
				for (int i = 0; i <size2;i++) {
					numb2[i]=sc2.nextInt();
				}
				int x= sc2.nextInt();
				//output 
				for (int i = 0; i <numb2.length; i++) {
					if (numb2[i]==x) {
						System.out.println("x found as inder:" + i);	
					}
					
				}

	}

}
