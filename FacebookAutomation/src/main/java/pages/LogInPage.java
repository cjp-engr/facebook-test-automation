package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LogInPage extends BasePage{
	
    private By emailAddressLocator = By.id("email");
    private By passwordTextboxLocator = By.id("pass");
    private By signInButtonLocator = By.xpath("/html/body/div[1]/div[2]/div[1]/div/"
    											+ "div/div/div[2]/div/div[1]/form/div[2]/button");
	
    public LogInPage(WebDriver browser) {
    	super(browser);
    }
	public UserAccountPage logIn(String emailAddress, String password) throws Exception {
		setEmailAddress(emailAddress);
		setPassword(password);
        clickSignInButton();
		return new UserAccountPage(browser);
	}
	
	private LogInPage setEmailAddress(String emailAddress) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddressLocator));
        WebElement emailTextbox = browser.findElement(emailAddressLocator);
        emailTextbox.clear();
        emailTextbox.sendKeys(emailAddress);
		return this;
	}
	
	private LogInPage setPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextboxLocator));
        WebElement passwordTextbox = browser.findElement(passwordTextboxLocator);
        passwordTextbox.clear();
        passwordTextbox.sendKeys(password);
		return this;
	}
	
    private UserAccountPage clickSignInButton() throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(signInButtonLocator));
        WebElement signInButton = browser.findElement(signInButtonLocator);
        signInButton.click();
        //checkForLoginFailure();
        return new UserAccountPage(browser);
    }

}
