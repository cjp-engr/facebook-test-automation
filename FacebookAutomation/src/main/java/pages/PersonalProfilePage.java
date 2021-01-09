package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.personalProfilePage.AboutTab;
import pages.personalProfilePage.FriendsTab;
import pages.personalProfilePage.MoreTab;
import pages.personalProfilePage.PhotosTab;
import pages.personalProfilePage.PostsTab;
import pages.personalProfilePage.StoryArchiveTab;

public class PersonalProfilePage extends BasePage{
	
	private By aboutLinkLocator = By.linkText("About");
	private By friendsLinkLocator = By.linkText("Friends");
	private By photosLinkLocator = By.linkText("Photos");
	private By storyArchiveLinkLocator = By.linkText("Story Archive");
	private By postsLinkLocator = By.linkText("Posts");
	private By moreLinkLocator = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/"
			+ "div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/div");
	
	private By editProfileLocator = By.cssSelector("#mount_0_0 > div > div:nth-child(1) > "
			+ "div.rq0escxv.l9j0dhe7.du4w35lb > div.rq0escxv.l9j0dhe7.du4w35lb > div > div > "
			+ "div.j83agx80.cbu4d94t.d6urw2fd.dp1hu0rb.l9j0dhe7.du4w35lb > div.dp1hu0rb.cbu4d94t.j83agx80 > "
			+ "div > div > div.rq0escxv.lpgh02oy.du4w35lb.rek2kq2y > div > div > div > "
			+ "div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.cbu4d94t.pfnyh3mw.d2edcug0.hpfvmrgz.o8rfisnq > "
			+ "div > div > div.h676nmdw.buofh1pr.h8xcmbcu > div > div > "
			+ "div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.pfnyh3mw.taijpn5t.bp9cbjyn.owycx6da.btwxx1t3.c4xchbtz.by2jbhx6 > "
			+ "div:nth-child(2) > span > span");
	private By editProfileCloseLocator = By.className("cypi58rs");
	
	private By viewAsLocator = By.cssSelector("#mount_0_0 > div > div:nth-child(1) > div.rq0escxv.l9j0dhe7.du4w35lb > "
			+ "div.rq0escxv.l9j0dhe7.du4w35lb > div > div > div.j83agx80.cbu4d94t.d6urw2fd.dp1hu0rb.l9j0dhe7.du4w35lb > "
			+ "div.dp1hu0rb.cbu4d94t.j83agx80 > div > div > div.rq0escxv.lpgh02oy.du4w35lb.rek2kq2y > div > div > div > "
			+ "div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.cbu4d94t.pfnyh3mw.d2edcug0.hpfvmrgz.o8rfisnq > div > div > "
			+ "div:nth-child(2) > div > span");
	
	private By exitViewAsLocator = By.cssSelector("#mount_0_0 > div > div:nth-child(1) > div.rq0escxv.l9j0dhe7.du4w35lb > "
			+ "div.rq0escxv.l9j0dhe7.du4w35lb > div > div > div.j83agx80.cbu4d94t.d6urw2fd.dp1hu0rb.l9j0dhe7.du4w35lb > "
			+ "div.dp1hu0rb.cbu4d94t.j83agx80 > div > div > div.rq0escxv.lpgh02oy.kavbgo14.rek2kq2y > div > "
			+ "div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.cbu4d94t.pfnyh3mw.d2edcug0.hpfvmrgz > a > "
			+ "div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.pfnyh3mw.taijpn5t.bp9cbjyn.owycx6da.btwxx1t3.c4xchbtz.by2jbhx6 > "
			+ "div > span > span");
	
	private By searchProfileLocator = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/"
			+ "div/div/div[3]/div/div/div/div[2]/div/div/div[3]/div/span/div/div[1]/div/img");
	
	private By searchProfileCloseLocator = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[4]/div/div/div[1]/div/"
			+ "div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/i");
	
	private By AddBioLocator = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div/"
			+ "div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/span/span/div");
	
	private By addBioCancelLocator = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/"
			+ "div/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/span/div/div/div[2]/div[2]/div[1]/"
			+ "div/div[1]/div/span/span");
	
	private By profileImageLocator = By.cssSelector("#mount_0_0 > div > div:nth-child(1) > div.rq0escxv.l9j0dhe7.du4w35lb > "
			+ "div.rq0escxv.l9j0dhe7.du4w35lb > div > div > div.j83agx80.cbu4d94t.d6urw2fd.dp1hu0rb.l9j0dhe7.du4w35lb > "
			+ "div.dp1hu0rb.cbu4d94t.j83agx80 > div > div > div:nth-child(1) > "
			+ "div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.pfnyh3mw.taijpn5t.gs1a9yip.owycx6da.btwxx1t3.ihqw7lf3.cddn0xzi > "
			+ "div > div > div.aovydwv3.o8rfisnq.j83agx80.do00u71z.tr9rh885 > div > div > div > div > div > svg > g");
	
	private By addPhotoLocator = By.xpath("//div[@class = 'j34wkznp qp9yad78 pmk7jnqg kr520xx4']");
	
	private By updateProfilePictureCloseLocator = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[4]/div/div/div[1]/div/"
			+ "div[2]/div/div/div/div[2]/div/i");
			
	private By cameraIconToUpdateProfilePictureLocator = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/"
			+ "div/div[1]/div[1]/div/div/div[1]/div[2]/div/div/div[1]/div/div/div/div/div/div[2]/div/div/i");
	
	private By addCoverPhotoLocator = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/"
			+ "div/div/div[1]/div[1]/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/span/span");
	
	
	public PersonalProfilePage(WebDriver browser) {
		super(browser);
	}
	
	public AboutTab clickAboutTab() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(aboutLinkLocator));
		browser.findElement(aboutLinkLocator).click();
		Thread.sleep(3000);
		return new AboutTab(browser);
	}
	
	public FriendsTab clickFriendsTab() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(friendsLinkLocator));
		browser.findElement(friendsLinkLocator).click();
		Thread.sleep(3000);
		return new FriendsTab(browser);
	}
	
	public PhotosTab clickPhotosTab() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(photosLinkLocator));
		browser.findElement(photosLinkLocator).click();
		Thread.sleep(3000);
		return new PhotosTab(browser);
	}

	public StoryArchiveTab clickStoryArchiveTab() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(storyArchiveLinkLocator));
		browser.findElement(storyArchiveLinkLocator).click();
		Thread.sleep(3000);
		return new StoryArchiveTab(browser);
	}
	
	public PostsTab clickPostsTab() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(postsLinkLocator));
		browser.findElement(postsLinkLocator).click();
		Thread.sleep(3000);
		return new PostsTab(browser);
	}
	
	public MoreTab clickMoreTab() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(moreLinkLocator));
		browser.findElement(moreLinkLocator).click();
		Thread.sleep(10000);
		browser.findElement(moreLinkLocator).click();
		return new MoreTab(browser);
	}
	
	public PersonalProfilePage clickEditProfileBtn() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(editProfileLocator));
		browser.findElement(editProfileLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickEditProfileCloseBtn() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(editProfileCloseLocator));
		browser.findElement(editProfileCloseLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickViewAsBtn() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewAsLocator));
		browser.findElement(viewAsLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickExitViewAsBtn() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(exitViewAsLocator));
		browser.findElement(exitViewAsLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickSearchProfileBtn() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchProfileLocator));
		browser.findElement(searchProfileLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickSearchProfileCloseBtn() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchProfileCloseLocator));
		browser.findElement(searchProfileCloseLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickAddBioLink()  throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddBioLocator));
		browser.findElement(AddBioLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickAddBioCancelBtn()  throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(addBioCancelLocator));
		browser.findElement(addBioCancelLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickProfileImage()  throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(profileImageLocator));
		browser.findElement(profileImageLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickaddPhotoBtn()  throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(addPhotoLocator));
		browser.findElement(addPhotoLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickUpdateProfilePictureCloseBtn()  throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(updateProfilePictureCloseLocator));
		browser.findElement(updateProfilePictureCloseLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickCameraIconToUpdateProfilePicture()  throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(cameraIconToUpdateProfilePictureLocator));
		browser.findElement(cameraIconToUpdateProfilePictureLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	public PersonalProfilePage clickAddCoverPhotoBtn()  throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(addCoverPhotoLocator));
		browser.findElement(addCoverPhotoLocator).click();
		Thread.sleep(3000);
		return this;
	}
	
	
	
}
