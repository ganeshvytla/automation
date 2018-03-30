package bootstrapwindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_bootstrap_win {

	@Test
	public void sada2() {
		

		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Generic-Terms-EM&utm_content=Book-Flight&campaign=DF-Generic-Terms-EM&gclid=Cj0KCQjw1-fVBRC3ARIsAIifYOPk8szozqyjXLRbZLZ2C-BQhXvVSg-cXR1_Kc9Qv_e05nbAryRQkpwaAgueEALw_wcB");

		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.findElement(By.xpath("//span[@class='ico13 blue db']//a[@id='get_sign_up']")).click();
	
		d.switchTo().frame(d.findElement(By.xpath(".//*[@id='authOverlay']/div/div")));

		
	d.findElement(By.xpath(".//*[@id='authMobile']")).sendKeys("ganesh");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}