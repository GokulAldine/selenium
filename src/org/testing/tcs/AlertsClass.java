package org.testing.tcs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsClass {
public static void main(String[] args) throws Throwable {
	 
	     System.setProperty("webdriver.chrome.driver", "C:\\IDE Eclipse\\SeleniumClassTasks\\src\\chromedriver.exe");  
	WebDriver alerts = new ChromeDriver();
	alerts.manage().window().maximize();
	
	alerts.get("https://nxtgenaiacademy.com/alertandpopup/");
	 
	WebElement clickButton = alerts.findElement(By.xpath("//button[@name='promptalertbox1234']"));
	clickButton.click();
	
	Alert al = alerts.switchTo().alert();
	
	Thread.sleep(5000);
	
	al.sendKeys("Helo Promt Alert");
	al.accept();
	String text = al.getText();
	System.out.println(text);
}
}
