package org.testing.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecute {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\IDE Eclipse\\SeleniumClassTasks\\src\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	       WebElement gmail = driver.findElement(By.id("email"));
	       WebElement pass = driver.findElement(By.id("pass"));
	       WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	
	          JavascriptExecutor jsE = (JavascriptExecutor)driver;
	            jsE.executeScript("arguments[0].setAttribute('value','facebook@gmail.com')", gmail);
	                Object script = jsE.executeScript("return arguments[0].getAttribute('value')", gmail);
		          System.out.println(script);
		          jsE.executeScript("arguments[0].setAttribute('value','9090900')" ,pass);
		              jsE.executeScript("arguments[0].click()", submit);
		              Thread.sleep(3000);
		              
		              driver.navigate().back();
		          
	}
}
