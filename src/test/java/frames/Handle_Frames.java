package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_Frames {

	@Test
	public void asdn()
{
		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

		WebDriver d = new ChromeDriver();
		
		d.get("https://paytm.com/");
		
		//d.switchTo().frame(2);
		d.findElement(By.xpath("//div[@class='_3ac-']")).click();
		
		//to find total frames in webpage
	 int totalframes = d.findElements(By.tagName("iframe")).size();
	 System.out.println(totalframes);
	 //swwitch to frame
      d.switchTo().frame("//div[@id='login-container']");
      
      d.findElement(By.xpath("//input[@id='input_0']")).sendKeys("9010556155");
      
      d.findElement(By.xpath("//input[@id='input_1']")).sendKeys("ganesh9010556155@");
      
      d.findElement(By.xpath(".//*[@id='loginForm']/div/md-content/button[1]")).click();
	}
}
