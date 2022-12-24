package org.testing.tcs;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\IDE Eclipse\\SeleniumClassTasks\\src\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
WebElement drop = driver.findElement(By.xpath("//select[@id='first']"));
	
	Select se = new Select (drop);
	boolean b = se.isMultiple();
	System.out.println(b);

       se.selectByIndex(2);
       Thread.sleep(3000);
       se.selectByValue("Microsoft");
       Thread.sleep(3000);
       se.selectByVisibleText("Yahoo");
   
           List<WebElement> options = se.getOptions();
           for (int i = 0; i < options.size(); i++) {
			WebElement x = options.get(i);
			String actualText = x.getText();
			System.out.println(actualText);
						}
           WebElement down = driver.findElement(By.xpath("//select[@id='second']"));
           
           Select se1 = new Select (down);
           se1.selectByIndex(0);
           se1.selectByIndex(1);
           se1.selectByIndex(2);
           Thread.sleep(4000);
           se1.deselectAll();
           List<WebElement> allSelectedOptions = se1.getAllSelectedOptions();
           System.out.println(allSelectedOptions);
           
           driver.quit();
		}
           }

