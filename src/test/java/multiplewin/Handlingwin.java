package multiplewin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlingwin {
	
@Test
	public void win() {
		
	System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

	WebDriver d = new ChromeDriver();
	
	d.findElement(By.xpath(""));
		
	}
}
