package creatingbaseclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class uploadfile {

	@Test
	public void upload1() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("file:///C:/Users/Ganesh/Desktop/fileupload.html");
		d.findElement(By.id("load")).click();
		
		
			Runtime.getRuntime().exec("C:\\Users\\Ganesh\\Desktop\\venu's tusion file\\doc.exe");
		
			
		
	
	}
}
