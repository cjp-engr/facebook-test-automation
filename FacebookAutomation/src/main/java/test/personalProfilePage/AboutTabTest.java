package test.personalProfilePage;

import org.junit.Test;

import pages.LogInPage;
import test.BrowsingPage;

public class AboutTabTest extends BrowsingPage{

	
	@Test
	public void about_Overview_AddAWorkplace() throws Exception {
		FacebookLinkBrowse();
		
        LogInPage login = new LogInPage(browser);
        login.logIn("oliviaisabella6996@gmail.com", "HELLOworld143!")
    	.navigateToHomePage()
    	.clickTheProfilePage()
    	.clickAboutTab()
    	.clickTheAddAWorkplace()
        .clickTheAddAWorkplaceBtn();
        browser.quit();
	}
	
}
