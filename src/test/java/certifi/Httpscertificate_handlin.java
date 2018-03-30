package certifi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Httpscertificate_handlin {

	@Test
	public void handle() {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

    WebDriver d = new ChromeDriver(cap);
	d.get("https://www.carter.org/");
	System.out.println("cleared certification prblm");
	
	
	}
}
