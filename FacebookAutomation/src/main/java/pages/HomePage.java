package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
	
	private By profileLinkLocator = By.linkText("Olivia Isabella");
	
	public HomePage(WebDriver browser) {
		super(browser);
	}
	
	public PersonalProfilePage clickTheProfilePage() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(profileLinkLocator));
		browser.findElement(profileLinkLocator).click();
		return new PersonalProfilePage(browser);
	}


}
