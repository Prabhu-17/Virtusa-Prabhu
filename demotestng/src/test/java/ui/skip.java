package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skip {
	
	Boolean datasetup=false;
	
	@Test(enabled=false)
	public void skiptest1() {
		System.out.println("Skipping is not complete");
	}
	
	@Test
	public void skiptest2() {
		System.out.println("Skipping test forcefully");
		throw new SkipException("Skipping this test");
	}
	
	@Test
	public void skiptest3() {
		System.out.println("Skipping is not complete based on condition");
		if(datasetup==true) {
			System.out.println("execute");
		}
		else {
			System.out.println("Do not execute");
			throw new SkipException("Do not execute");
		}
	}
}
