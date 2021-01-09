package test;

import org.junit.Ignore;
import org.junit.Test;

import pages.LogInPage;

public class UserProfileTest extends BrowsingPage{
	
	@Test @Ignore
	public void UserProfileClick() throws Exception{
		FacebookLinkBrowse();
		
        LogInPage login = new LogInPage(browser);
        login.logIn("oliviaisabella6996@gmail.com", "HELLOworld143!")
        	.navigateToHomePage()
        	.clickTheProfilePage();
	}
	
	@Test
	public void UserProfileElement() throws Exception {
		FacebookLinkBrowse();
		
        LogInPage login = new LogInPage(browser);
        login.logIn("oliviaisabella6996@gmail.com", "HELLOworld143!")
				.navigateToHomePage()
				.clickTheProfilePage()

				.clickAboutTab()
				.navigateToProfilePage()
				.clickFriendsTab()
				.navigateToProfilePage()
				.clickPhotosTab()
				.navigateToProfilePage()
				.clickStoryArchiveTab()
				.navigateToProfilePage()
				.clickPostsTab()
				.navigateToProfilePage()
				.clickMoreTab()
				.navigateToProfilePage()
				
				.clickEditProfileBtn()
				.clickEditProfileCloseBtn()
				.navigateToProfilePage()
				
				.clickViewAsBtn()
				.clickExitViewAsBtn()
				.navigateToProfilePage()
				
				.clickSearchProfileBtn()
				.clickSearchProfileCloseBtn()
				.navigateToProfilePage()
				
				.clickAddBioLink()
				.clickAddBioCancelBtn()
				.navigateToProfilePage()
				
				.clickProfileImage()
				.clickaddPhotoBtn()
				.clickUpdateProfilePictureCloseBtn()
				.navigateToProfilePage()
				
				.clickCameraIconToUpdateProfilePicture()
				.clickUpdateProfilePictureCloseBtn()
				.navigateToProfilePage()
				
				.clickAddCoverPhotoBtn();
						
        		browser.quit(); 
	}
	
}
