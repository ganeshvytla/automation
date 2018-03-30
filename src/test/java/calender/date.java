package calender;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class date {

	@Test
	public void picker() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Generic-Terms-EM&utm_content=Book-Flight&campaign=DF-Generic-Terms-EM&gclid=Cj0KCQjw1-fVBRC3ARIsAIifYOPk8szozqyjXLRbZLZ2C-BQhXvVSg-cXR1_Kc9Qv_e05nbAryRQkpwaAgueEALw_wcB");
	
		System.out.println(d.getTitle());
		//d.findElement(By.xpath("//input[@placeholder='Choose Date']")).click();
		String parentwin=d.getWindowHandle();
		
		System.out.println(parentwin);
		
		//Thread.sleep(3000);
		
		
		
		Set<String> childwin = d.getWindowHandles();
		d.findElement(By.xpath(".//*[@id='Home']/div[3]/div[3]/div/div/div[1]/ul/li[3]/div/h3")).click();
		Iterator <String> it =childwin.iterator();
		
		while(it.hasNext()) {
			
			String s2 = it.next();
			
				
				
			if(!parentwin.equals(s2)) {
				
				d.switchTo().window(s2);
				
				System.out.println(d.getTitle());
				
				d.close();
				}
			
		
		
		}
		
		d.switchTo().defaultContent();
		
		
		
}
}