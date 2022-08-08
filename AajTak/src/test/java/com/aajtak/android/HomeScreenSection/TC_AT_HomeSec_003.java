package com.aajtak.android.HomeScreenSection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify section contains news list in 3 different formats Stories, Photo Gallery and Videos
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeSec_003 extends Aajtak_app_Util{

	@Test(description="Description : Verify section contains news list in 3 different formats Stories, Photo Gallery and Videos",priority = 3)
	public void AT_HomeSec_003() throws InterruptedException {

		//Launching the app
		launchApp();

		//Complete onboard set up
		compelteOnboarding();

		//Scrolling till the story element  
		scrollToElement(homescreen.getStoryInHomeScreen());

		// Story verification
		isElementExist(homescreen.getStoryInHomeScreen(), "Story Detail");

		//Scrolling till the photo element
		scrollToElement(homescreen.getFirstGalleryInHomeScreen());

		// Gallery verification
		isElementExist(homescreen.getFirstGalleryInHomeScreen(), "Image Gallery ");

		//Scrolling till the photo element
		scrollToElement(homescreen.getFirstVideoInHomeScreen());

		// Video verification
		isElementExist(homescreen.getFirstVideoInHomeScreen(), "Video");

	}

}
