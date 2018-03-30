package hiddenelemn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findele2 {
@Test
public void vf() {
	

	System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
WebElement ele = d.findElement(By.xpath("//input[@id='male'][2]"));
ele.click();
//int y = d.findElement(By.id("//input[@id='male'][2]")).getLocation().getY();


	
}
}