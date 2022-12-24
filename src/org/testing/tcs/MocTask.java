package org.testing.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MocTask {
public static void main(String[] args) {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\IDE Eclipse\\SeleniumClassTasks\\src\\chromedriver.exe");
	
	  WebDriver driver = new ChromeDriver ();
	  driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_19f32o2up6_e&adgrpid=64607481971&hvpone=&hvptwo=&hvadid=486382354470&hvpos=&hvnetw=g&hvrand=6445891143219311272&");
	  driver.manage().window().maximize();
}
}
