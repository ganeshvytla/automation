package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Creatinggrid {

	@Test
	public void can() throws MalformedURLException  {
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		
		cap.setPlatform(Platform.WINDOWS);
		
		URL u = new URL("http://localhost:4444/wd/hub");
		
		WebDriver d = new RemoteWebDriver(u, cap);
		
		d.get("gkjdjlsdj");
		
	}
}
