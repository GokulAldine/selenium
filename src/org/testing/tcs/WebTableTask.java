package org.testing.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\IDE Eclipse\\SeleniumClassTasks\\src\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	 
	        
	       WebElement table = driver.findElement(By.xpath("//th[contains(text(),'Company')]"));
	            List<WebElement> tableRows = table.findElements(By.tagName("tr")); 
    	       for (int i = 0; i < tableRows.size(); i++) {
				WebElement element = tableRows.get(i);
				String text = element.getText();
				System.out.println(text);
				
			}
	        
}
}
