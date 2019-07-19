package tests;

import org.testng.annotations.Test;

import base.Config;

public class VerifyWebsiteURL extends Config {

	
	@Test
	public void verifyURL(){
		String ab=driver.getCurrentUrl();
		if(ab.equalsIgnoreCase("https://www.saksfifthavenue.com/Entry.jsp")){
			System.out.println("User used right URL");
		}
		else{
			System.out.println("User didn't use right URL");
		}
	}
	
	
	
	
	
}
