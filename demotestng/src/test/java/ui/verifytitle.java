package ui;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class verifytitle {
	
	
	@Test
	public void titleTest() {
		String expectedtitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		WebDriver ch=new ChromeDriver();
		ch.get("http://www.ebay.com");
		String actualtitle=ch.getTitle();
		
		AssertJUnit.assertEquals(actualtitle, expectedtitle);
		ch.close();
	
	}
}
