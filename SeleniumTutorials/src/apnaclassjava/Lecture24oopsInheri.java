package apnaclassjava;

class Shape{
	public void area() {System.out.println("display area");}
}

class trianlge extends Shape{
	public void area(int l,int h) {
		System.out.println("are of trianalge:"+ 1/2*l*h );
	}
}
	
class circle extends Shape{
		public void area(int r) {
			System.out.println("are of circle:"+ (3.14)*r*r);
			
		}
		
	}

public class Lecture24oopsInheri {

	public static void main(String[] args) {
		// shape class 
		
		//Shape sh= new Shape();
		//sh.area();
		
		circle cr=new circle();
		cr.area();
		cr.area(2);// here we are defining the value and this value is than passed to called funtion i.e area(int r) of class circle

	}

}
