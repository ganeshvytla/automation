package highlight_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Programforhiglighting {

	@Test
	public void swed() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
   WebElement usr = d.findElement(By.xpath("//input[@id='email']"));
	Coloringtoele.wer(usr, d);
	usr.sendKeys("ganesh.vytla@gmail.com");
	
	WebElement pswd = d.findElement(By.xpath("//input[@id='pass']"));
	Coloringtoele.wer(pswd, d);
	pswd.sendKeys("ganesh9010556155@");
	
	WebElement lgnbtn = d.findElement(By.xpath("//input[@type='submit']"));
	Coloringtoele.wer(usr, d);
	lgnbtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
