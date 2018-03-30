package sendingemeil;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class setmail {

	@Test
	public static void awe() throws EmailException {
		
		System.out.println("==============email started============");
	
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("ramaganesh.vytla@gmail.com", "ganesh.vytla@gmail.com"));
		//email.setSSLOnConnect(true);
		email.setFrom("ramaganesh.vytla@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("ramaganesh.vytla@gmail.com");
		email.send();
		System.out.println("email sent");
	
	
	
	
	}
}
