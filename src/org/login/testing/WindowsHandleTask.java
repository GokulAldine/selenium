package org.login.testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleTask {
public static void main(String[] args) throws Throwable  {
	 
	     System.setProperty("webdriver.chrome.driver", "C:\\\\IDE Eclipse\\\\SeleniumClassTasks\\\\src\\\\chromedriver.exe") ;
	
	WebDriver web = new ChromeDriver();
	     
	     web.get("https://flipkart.com/");
	     web.manage().window().maximize();
	     
	  web.findElement(By.xpath("//button[text()='✕'])")).click();
	  web.findElement(By.name("q")).sendKeys("Redmi mobiles",Keys.ENTER);
	  Thread.sleep(3000);
	  web.findElement(By.xpath("//div[@class='_4rR01T'])[1]")).click();
	 // web.findElement(By.xpath("//span[@class='B_NuCI']")).click();
	  String parent = web.getWindowHandle();
	  
	  Set<String> child = web.getWindowHandles();
	  	  System.out.println(child);
	  System.out.println(child);
	  
	  for(String x : child) {
	    if (!parent.equals(x)) {
	    	web.switchTo().window(x);
	    	String text = web.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	    	System.out.println(text);
	    }
	  }
}
}