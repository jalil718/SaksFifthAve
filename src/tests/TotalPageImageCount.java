package tests;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Config;

public class TotalPageImageCount extends Config {

	@Test
	public void totalImageCount(){
		List<WebElement> ab= driver.findElements(By.tagName("img"));
		System.out.println(ab.size());
	}
}
