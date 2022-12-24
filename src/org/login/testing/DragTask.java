package org.login.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragTask {
public static void main(String[] args) throws InterruptedException {
	
	     System.setProperty("webdriver.chrome.driver", "C:\\IDE Eclipse\\SeleniumClassTasks\\src\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	   driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
	   
	   driver.findElement(By.xpath("//li[@id='Photo Manager']")).click();
	   
	   WebElement drag1 = driver.findElement(By.xpath("(//*[contains(text(),'High Tatras')])[1]"));
	   WebElement drop1 = driver.findElement(By.xpath("//div[@id='trash']"));
	   
	  // WebElement drag2 = driver.findElement(By.xpath("(//a[contains(text(),' 5000 ')])[1]"));
	   
	   Actions ac = new Actions(driver);	
	   Thread.sleep(3000);
	      ac.dragAndDrop(drag1, drop1).build().perform();
	   
	  // Thread.sleep(3000);
	   
	  // WebElement drag2 = driver.findElement(By.xpath("(//a[contains(text(),' 5000 ')])[1]"));
	 //  WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	  // ac.dragAndDrop(drag2, drop2).build().perform();
	   
	   
}

}
