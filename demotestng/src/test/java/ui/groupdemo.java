package ui;

import org.testng.annotations.Test;

@Test(groups="user-register")
public class groupdemo {
	
      
	  @Test(priority=1,groups="regression")
	  public void aTest1(){
		  System.out.println("Test1");
	  }
	  
	  @Test(priority=2,groups="regression")
	  public void aTest2() {
		  System.out.println("Test2");
	  }
	  
	  @Test(groups={"regression","bvt"})
	  public void aTest3() {
		  System.out.println("Test3");
	  }
	  
	  @Test(groups="bvt")
	  public void aTest4() {
		  System.out.println("Test4");
	  }
}
