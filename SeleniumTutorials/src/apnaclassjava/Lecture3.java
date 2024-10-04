package apnaclassjava;

import java.util.Scanner;

public class Lecture3 {

	public static void main(String[] args) throws InterruptedException {
		// conditional statement--> if, else , switch,
		
		/*
		 * // if else Scanner sc= new Scanner(System.in); Thread.sleep(1000); int a=
		 * sc.nextInt();
		 * 
		 * //if (a>18) --> use for comparing age for adult if (a%2==0)
		 * 
		 * 
		 * { System.out.println("number is even"); } else {
		 * System.out.println("number is odd"); }
		 */
		
		// if else then under else again if else condition
		/*
		 * Scanner sc= new Scanner(System.in); Thread.sleep(1000); int a= sc.nextInt();
		 * Thread.sleep(1000); int b= sc.nextInt();
		 * 
		 * if (a==b)
		 * 
		 * { System.out.println("a and b are equal"); } else { if (a>b) {
		 * System.out.println("a is greater then b");
		 * 
		 * } else { System.out.println("b is greater then a");
		 * 
		 * }
		 * 
		 * }
		 */
		
		// if - else if-  else  condition (take above example )
		/*
		 * Scanner sc1= new Scanner(System.in); Thread.sleep(1000); int c=
		 * sc1.nextInt(); Thread.sleep(1000); int d= sc1.nextInt(); if (c==d) {
		 * System.out.println("c and d are equal");}
		 * 
		 * else if(c>d) {System.out.println("c is greater than d");} else
		 * {System.out.println("d is greater than c");} }
		 */
	
	// if - else if-- else if- else  condition 
	/*
	 * Scanner sc2= new Scanner(System.in); int button= sc2.nextInt();
	 * Thread.sleep(1000); if (button==1) { System.out.println("hello");}
	 * 
	 * else if(button==2) {System.out.println("namaste");} else if(button==3)
	 * {System.out.println("bonjour");} else {System.out.println("inavlid button");}
	 */
			
			// switch-break   condition (take above example )
			
			Scanner sc3= new Scanner(System.in);
			int button1= sc3.nextInt();
			switch (button1) {
			case 1:System.out.println("hello");
			break;
			case 2:System.out.println("mamaste");
			break;
			case 3:System.out.println("bonjour");
			break;

			default:System.out.println("invalid -button");
				break;
			}
		
}}
