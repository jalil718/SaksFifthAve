package tests;

import org.testng.annotations.Test;

import base.Config;

public class VerifyUserLandedOnTheRightPage extends Config {

	
	@Test
	public void verifyPage(){
		System.out.println(driver.getTitle());
		String ab=driver.getTitle();
		if(ab.equalsIgnoreCase("Designer Women's Apparel, Men's Apparel, Shoes & Handbags - Saks.com")){
			System.out.println("User landed on the right page");
		}
		else{
			System.out.println("User didn't land on the right page");
		}
	}
	
	
	
	
	
	
	
}
