package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;

public class CountTotalLinkInThePage extends Config {

	@Test
	public void countTotalLink(){
		List<WebElement> ab=driver.findElements(By.tagName("a"));
		System.out.println(ab.size());
		for(int i=0;i<ab.size();i++){
			System.out.println(ab.get(i).getText());
		}
	}
	
	
	
	

}
