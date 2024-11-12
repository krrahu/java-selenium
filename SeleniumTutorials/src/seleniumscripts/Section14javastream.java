package seleniumscripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Section14javastream {
	

public static void main(String[] args) throws InterruptedException {
	
	
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("rahul");
	al.add("kumar");
	al.add("Tester");
	int count=0;
	
	for (int i = 0; i <al.size(); i++) 
	{
		String names=al.get(i);
		if (names.startsWith("A"))
				{
			count++;
		
				}
		//System.out.println("No of people whose name start with A :" +count);
	}
	System.out.println("No of people whose name start with A :" +count);


//upper code can be written in 3 ways just for optimization of code	
 // @Test 
  // 1st way 
  /*public static void method2() {
	  ArrayList<String> al = new  ArrayList<String>(); 
	  al.add("Rahul"); 
	  al.add("kumar"); 
	  al.add("Tester");
	  // first it will Store all string values in stream() then from list it will filter the only  names whose first letter start with R then it will give count
 long total= al.stream().filter(s->s.startsWith("R")).count();
  System.out.println(total);
  }*/
  
  
  //====================== 2nd way============
  
/* long d = Stream.of("test","developer","QA","Bussiness").filter(s->
 {
	 s.startsWith("R");
		 return true;
 }).count();
 System.out.println(d);*/
 
 
 // ==========3rd way===================
 //Print all the name from Array list when we apply any conditions

//al.stream().filter(s->s.length()>4).forEach(s->System.out.println(d));
//names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(d));

	
	
		
 // ==========4th way===================
 //Print all the name which has last letter as r and convert into caps	

 Stream.of("tester","developer","QA","Bussiness").filter(s->s.endsWith("r")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

 //  Print all the name which  start with letter as B & sorted it and convert into caps 
 
 List<String>str= Arrays.asList("tester","Bdeveloper","QA","Bussiness");
 str.stream().filter(s->s.startsWith("B")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
 
 // merge 2 different  list by using concat --> code not working need to check 
 
// public void streamMap() 
// {
//	 ArrayList<String> alist = new ArrayList<String>();
//	 alist.add("rahul");
//	 alist.add("kumar");
//	 alist.add("Tester");
// 
// 
// Stream <String> mergelist=Stream.concat(alist, stream(),str.stream());
// mergelist.sorted().forEach(s->System.out.println(s));
 
 // stream collect --> it will return al the output in list i.e collection form we use index method to print o/p
 List<String>str1= Arrays.asList("Bob","lob","QA","Ba");
 str1.stream().filter(s->s.startsWith("B")).map(s->s.toUpperCase()).collect(Collectors.toList());
 System.out.println(str1.get(0));
 
 // 
 List<Integer>values= Arrays.asList(1,3,4,8,6,9,9,2,2,7);
 values.stream().distinct().forEach(s->System.out.println(s)); // print unique  values from list
 // now sort the arrya & store in list and then print the value at 3rd index 
 List<Integer>li=values.stream().distinct().sorted().collect(Collectors.toList());
 System.out.println(li.get(3));
 
System.out.println(values.stream().distinct().sorted().collect(Collectors.toList()));
System.out.println(values.stream().distinct().sorted().collect(Collectors.toList()).get(3));

 
 
 
}




}
