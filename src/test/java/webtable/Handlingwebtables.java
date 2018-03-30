package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlingwebtables {

	@Test
	public void asdf() {
		
		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.timeanddate.com/worldclock/");
		
		d.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
		
		List <WebElement> col=d.findElements(By.tagName("td"));
		
		int countcol = col.size();
		
		System.out.println(countcol);
		
		for(int i=0;i<countcol;i++) {
			
			String names = col.get(i).getText();
			
			System.out.println(names);
			
			
			
		}
	}
}
