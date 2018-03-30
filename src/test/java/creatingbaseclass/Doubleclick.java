package creatingbaseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Doubleclick {

	@Test
	public void validcred() {
		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.facebook.com/");
		
		

		WebElement item = d.findElement(By.xpath("//div[text()='Facebook helps you connect and share with the people in your life.']"));

		Actions dummy = new Actions(d);

		dummy.doubleClick(item).build().perform();
		
		String text =item.getText();
		System.out.println("text captured " +text);
		
		/*d.findElement(By.xpath("//*[@id='email']"));
		d.findElement(By.xpath("//*[@id='email']"));
*/
	}
}
