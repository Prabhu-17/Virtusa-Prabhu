package ui;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class logintest {
	@BeforeTest
	public void log1() {
		System.out.println("loggin to application");
	}
	
	@AfterTest
	public void log2() {
		System.out.println("logout from application");
	}
	
	@BeforeMethod
	 public void connectToDB() {
		 System.out.println("DB Connected");
	 }
	 
	@AfterMethod
	 public void DisconnectFromDB() {
		 System.out.println("DB Disonnected");
	 }
      
	  @Test(priority=1,description="loggedin")
	  public void Logintest(){
		  System.out.println("Login is successful");
	  }
	  
	  @Test(priority=2,description="loggedout")
	  public void LogoutTest() {
		  System.out.println("Logout is successful");
	  }
}
