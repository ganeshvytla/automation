package assertdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {

	@Test
	public void wsdef() {
		
		Assert.assertEquals(23, 23);
		System.out.println("test ckomo");
	}
}
