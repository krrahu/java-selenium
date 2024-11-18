package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test4 
{
	 @Test (enabled=false) // use if we don't wants to run this (right now  facing issue not working need to check)
	  public void Dev() 
		  
		  {
		
			  System.out.println("hello");
		  
		  }
	 @Test (timeOut=4000)
	 public void testerM() 
	  
	  {
		
		  System.out.println("Bye tesert m");
	  
	  }
	 @Test(groups= {"smoke"})
	 public void testerA() 
	  
	  {
		
		  System.out.println("Bye smoke");
	  
	  }
	 @Test 
	 public void testerW() 
	  
	  {
		
		  System.out.println("Bye tesrt W");
	  
	  }
	 @Test(dependsOnMethods= {"testerW","testerM"})// Business () will run only after testerW and testerM will execute
	 public void Business() 
	  
	  {
		
		  System.out.println("see you ");
	  
	  }

}
