package test;

import org.junit.Test;

import pages.LogInPage;

public class UserLogInTest extends BrowsingPage{
	
	@Test
	public void UserLoginToFacebook() throws Exception {
		FacebookLinkBrowse();
        
        LogInPage login = new LogInPage(browser);
        login.logIn("oliviaisabella6996@gmail.com", "HELLOworld143!");
	}
	
}

