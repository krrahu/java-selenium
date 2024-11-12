package javaprograms;

public class brushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numb=4;
		String str="learning";
		char ch='a';
		double de=2.3;
		boolean bol=true;
		System.out.println(numb +" "+ str); // 
		
		// arrays
		int []arr=new int [4]; // initiazling the array, here we defining array type and  lenght i.e size of array define
		arr[0]=1; // declaration, 
		arr[1]=3;
		arr[2]=5;
		arr[3]=15;
		
		int []arr1= {1,2,3,4,5,6}; // initiazling  and declaration 
		//System.out.println(arr1[0]); // index based printing 
		
		// for loop
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			
		}
		
		// string array
		String [] strt= {"rahul","kumar","java","selenium"};
		
		// for loop
		for (int i = 0; i < strt.length; i++) 
		{
			System.out.println(strt[i]);
			
		}
		
		// for each loop
		for (String s : strt) {
			System.out.println(s);
			
		} 
		
		
		
		
		
		
		
		

	}

}
