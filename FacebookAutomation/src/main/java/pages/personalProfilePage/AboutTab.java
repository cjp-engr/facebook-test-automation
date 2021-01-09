package pages.personalProfilePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.BasePage;

public class AboutTab extends BasePage{
	
	private By addAWorkplaceLocator = By.linkText("Add a workplace");
	private By addAWorkplaceCancelLocator = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/div/div[6]/div[2]/div[1]/div/div[1]/div/span/span");
			
	public AboutTab(WebDriver browser) {
		super(browser);

	}
	
	public AboutTab clickTheAddAWorkplace() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(addAWorkplaceLocator));
		browser.findElement(addAWorkplaceLocator).click();
		Thread.sleep(7000);
		return this;
	}
	
	public AboutTab clickTheAddAWorkplaceBtn() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(addAWorkplaceCancelLocator));
		browser.findElement(addAWorkplaceCancelLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	

}
