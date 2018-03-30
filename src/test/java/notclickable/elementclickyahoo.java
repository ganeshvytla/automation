package notclickable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class elementclickyahoo {

	@Test
	public void fggh() {
		
		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://login.yahoo.com/");
		
		//d.findElement(By.xpath("//label[@for='persistent']")).click();
		
		Actions act = new Actions(d);
		
		act.moveToElement(d.findElement(By.xpath("//label[@for='persistent']"))).click().build().perform();
		
	}
}
