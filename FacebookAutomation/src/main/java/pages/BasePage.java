package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
    protected WebDriver browser;
    protected WebDriverWait wait;
    
    private By siteLogoLocator = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[1]/a");

    public BasePage(WebDriver browser) {
        this.browser = browser;
        // wait for page to load
        wait = new WebDriverWait(browser, 10);
    }
    
    
	public HomePage navigateToHomePage() {
		
        wait.until(ExpectedConditions.visibilityOfElementLocated(siteLogoLocator));
        org.openqa.selenium.WebElement homeLink = browser.findElement(siteLogoLocator);
        homeLink.click();
        return new HomePage(browser);
	}
	
	public PersonalProfilePage navigateToProfilePage() {
        return new PersonalProfilePage(browser);
	}
	
}
