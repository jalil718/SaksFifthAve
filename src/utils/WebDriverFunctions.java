package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverFunctions {

	protected static WebDriver driver;
	// type
	 // by xpath, 
	 // by id
	 // by class
	 // by css
	
	// click
	 // by link
	 // tagname
	 // by xpath
	
	// getText
	// radioButton
	// dropdown
	// iFrame
	// windows handle
	// switch
	// ---------------------------- EDIT BOX ----------------
	public void typeByXpath (String loc, String val){
		driver.findElement(By.xpath(loc)).sendKeys(val);
	}
	
	public void typeByName (String loc, String val){
		driver.findElement(By.name(loc)).sendKeys(val);
	}
	
	public void typeById(String loc, String val){
		driver.findElement(By.id(loc)).sendKeys(val);
	}
	
	public void typeByClass(String loc, String val){
		driver.findElement(By.className(loc)).sendKeys(val);
	}
	
	public void typeByCss(String loc, String val){
		driver.findElement(By.cssSelector(loc)).sendKeys(val);
	}
	
	
	
	
	
	// ----------------------- CLICK -------------------
	public void clickByXpath (String loc){
		driver.findElement(By.xpath(loc)).click();
	}
	
	public void clickByLinkText(String loc){
		driver.findElement(By.linkText(loc));
	}
	
	public void clickByName(String loc){
		driver.findElement(By.name(loc)).click();
	}
	
	public void clickById(String loc){
		driver.findElement(By.id(loc)).click();
	}
	
	public void clickByClass(String loc){
		driver.findElement(By.className(loc)).click();
	}
	
	public void clickByCss(String loc){
		driver.findElement(By.cssSelector(loc)).click();
	
	}
	
	
	
	
	// -------------- TIME
	public void currentTime() {
		// java code to get the current time
	}
	
	
	// implicit wait
	public void customSleep (int x) throws InterruptedException{
		Thread.sleep(x);
	}
	public void implicitWait(int y){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	//	explicit wait
	
	// --------------------------- RadioButton------------------------------
	
	//linktexts visibility
	
	public void linkTextsVis(String loc){
	
	System.out.println(driver.findElement(By.xpath(loc)).getText());
		
	}
	
	//.............................Drop Down List(By Visible Texta).............................
	public  void dropDownByXpath (String locator, String text){
		WebElement dropDownListBox = driver.findElement(By.xpath(locator));
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByVisibleText(text);
			}
	public  void dropDownByName (String locator, String text){
		WebElement dropDownListBox = driver.findElement(By.name(locator));
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByVisibleText(text);
			}
	public void dropDownById (String locator, String text){
		WebElement dropDownListBox = driver.findElement(By.id(locator));
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByVisibleText(text);
	}
	
	public void dropDownByCss (String locator, String text){
		WebElement dropDownListBox = driver.findElement(By.cssSelector(locator));
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByVisibleText(text);
	}

	public void drop (String locator, String value){
		WebElement select = driver.findElement(By.id(locator));
		Select dropDown = new Select(select);           
		String selected = dropDown.getFirstSelectedOption().getText();
		if(selected.equals(value)) {//do stuff already selected}
		List<WebElement> Options = dropDown.getOptions();
		for(WebElement option:Options){
		  if(option.getText().equals(value)){
		       option.click();  
		  }
		}
		}
	}

	
	//-------------------Drop Down List (By value)--------------------------------
	public  void dropDownByNameAndValue (String locator, String text){
		WebElement dropDownListBox = driver.findElement(By.name(locator));
		Select clickThis = new Select(dropDownListBox);
		clickThis.selectByValue(text);
		
	}
		
	public  void dropDownByXpathAndValue (String locator, String text){
			WebElement dropDownListBox = driver.findElement(By.xpath(locator));
			Select clickThis = new Select(dropDownListBox);
			clickThis.selectByValue(text);
				}
	
	public void dropDownByIdAndValue (String locator, String text){
			WebElement dropDownListBox = driver.findElement(By.id(locator));
			Select clickThis = new Select(dropDownListBox);
			clickThis.selectByVisibleText(text);
		}
		
	public void dropDownByCssAndValue (String locator, String text){
			WebElement dropDownListBox = driver.findElement(By.cssSelector(locator));
			Select clickThis = new Select(dropDownListBox);
			clickThis.selectByVisibleText(text);
		}
	


	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
