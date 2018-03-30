package creatingbaseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Baseclass2 {

	@Test
	public void getwholetextinpage() {
	
		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("http://en.wikipedia.org");
		
		WebElement ele=d.findElement(By.xpath("/html/body"));
		
	System.out.println(ele.getText());
	}
}
