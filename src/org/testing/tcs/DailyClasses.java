package org.testing.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DailyClasses {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\IDE Eclipse\\SeleniumClassTasks\\src\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.spotify.com/in-en/free/?utm_source=in-en_brand_contextual_text&utm_medium=paidsearch&utm_campaign=alwayson_asia_in_premiumbusiness_core_brand_neev+contextual+in-en+google&gclid=EAIaIQobChMI1Lq_payF_AIVRTUrCh2jKAIkEAAYASAAEgJY5_D_BwE&gclsrc=aw.ds");
	 
	WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
	element.click();
	
	WebElement sign = driver.findElement(By.name("email"));
	   sign.sendKeys("Helo Spotify");
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;	   
   
			  js.executeScript("window.scroll(0,350)");
			  
			  WebElement findElement = driver.findElement(By.name("confirm"));
			  findElement.sendKeys("helo@gmail.com");
			  WebElement findElement2 = driver.findElement(By.xpath("//input[@type='password']"));
			  findElement2.sendKeys("0909090909090");
			  
			  js.executeScript("window.scroll(350,600)");
			  WebElement findElement3 = driver.findElement(By.id("displayname"));
			  findElement3.sendKeys("Good Evening");
			  
			  WebElement findElement4 = driver.findElement(By.xpath("//input[@id='year']"));
			  findElement4.sendKeys("1999");
			  
			  WebElement findElement5 = driver.findElement(By.xpath("//select[@id='month']"));
			  
			      Select s = new Select(findElement5);
			         s.selectByValue("11");
			  
			         WebElement findElement6 = driver.findElement(By.xpath("//select[@id='month']"));
			  findElement6.sendKeys("11");
			  
			  
			  
			  
			  
}
}
