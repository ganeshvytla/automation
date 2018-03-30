package sendingemeil;

import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void sdd() {
		int a=100;
		int b=10;
		Assert.assertEquals(a, b);
		System.out.println("test done");
		}
	
	@BeforeMethod
	public void sddd() {
		
		System.out.println("test started");
	}
	
	@AfterMethod
	public void vnj(ITestResult result) throws EmailException {
		if(result.getStatus()==ITestResult.FAILURE)
		setmail.awe();
		System.out.println("test completse");
	}
	
}
