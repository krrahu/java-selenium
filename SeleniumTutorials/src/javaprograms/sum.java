package javaprograms;

public class sum 
{
	static int a =12;
	static int b =11;
	double d;
	int  sum= a+b;
	int  sub= a-b;
	
	public double m1()
	{
		double mul=a*b;
		return mul;
		
				
	}
	public double m2() 
	{
		//m1();
		double additon=a+b;
		return additon;
		//System.out.println(m1());
	}
	public double m3()
	{
		double sub=a-b;
		return sub;
		
				
	}
	
	public static class Subclass
	{
	
	public static void main(String[] args) {
		
		sum s=new sum();
		s.d=11;
		System.out.println(s.d);
		System.out.println("welcome ");
		//int  sum= a+b;
		//int  sub= a-b;
		//System.out.println(sum);
		System.out.println(s.sub);
		System.out.println(s.sum);
		System.out.println(s.m1());
		//4System.out.println(s.m2());
		//System.out.println(s.m3());
		
		
		
	}


}}
