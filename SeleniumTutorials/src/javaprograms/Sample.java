package javaprograms;

import apnaclassjava.Lecture4;

public class Sample {
	{
		String s="test";	

		}
		 
	
	class sample1 extends Sample
		{
			void music() { 
				System.out.println("play music");}

		}

	  class sample2 extends sample1
	  {
			void game() { 
				System.out.println("play tenis");}

		}
	  
	  class sample3 extends sum // extending class of other package
	  {
		  //sum s=new sum();
		  
	  }
	public static void main(String[] args) {
		sum s=new sum();
		double d=s.m1();
		System.out.println(d);
		s.m2();
		System.out.print(s.m2());
		
		

	}

}
