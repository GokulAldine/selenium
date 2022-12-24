package org.testing.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverTask {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\IDE Eclipse\\SeleniumClassTasks\\src\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 
	//driver.get("https://www.flipkart.com/");
	driver.get("https://qatechhub.com/mouse-hover-actions-selenium-webdriver/");
	driver.manage().window().maximize();
	   
	WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Tutorials')])[1]"));
	  
	    Actions a = new Actions(driver);
	    
	    a.moveToElement(element).perform();
}

}
