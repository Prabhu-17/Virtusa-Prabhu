package ui;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifytitleandtext {
	
	
	@Test
	public void titleTest() {
		SoftAssert soft=new SoftAssert();
		String expectedtitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String Expectedtext="Search";
		WebDriverManager.chromedriver().setup();
		WebDriver ch=new ChromeDriver();
		ch.get("http://www.ebay.com");
		String actualtitle=ch.getTitle();
	    System.out.println("verifying title");
		String actualtext = ch.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		
		AssertJUnit.assertEquals(actualtitle, expectedtitle);
		
		System.out.println("verifyingText");
		
	   AssertJUnit.assertEquals(actualtext, Expectedtext, "Textnotfound");
	   System.out.println("closing browser");
		
		
		ch.close();
		soft.assertAll();
	
	}
}
