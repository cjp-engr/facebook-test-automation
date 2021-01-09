package test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowsingPage {
	
	protected WebDriver browser = null;
	
	public void FacebookLinkBrowse() throws Exception{
        //WebDriver browser = null;
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Files\\eclipse-workspace\\SeleniumMavenDemo\\WebDrivers\\Chrome\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		browser = new ChromeDriver(options);
		browser.get("https://www.facebook.com/");

        try {
            browser.manage().window().maximize();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
