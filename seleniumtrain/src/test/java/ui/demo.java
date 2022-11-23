package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
        driver.get("http://www.ebay.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Bike");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        driver.close();
	}

}



