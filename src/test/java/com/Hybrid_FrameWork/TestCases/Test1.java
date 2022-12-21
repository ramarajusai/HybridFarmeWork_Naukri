package com.Hybrid_FrameWork.TestCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Hybrid_FrameWork.PageObjects.LoginPage;

public class Test1 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {
		driver.get(url);
		LoginPage lp = new LoginPage(driver);

		Thread.sleep(3000);
		lp.enterUsername(username);
		logger.info("Username is entered");

		lp.enterPassword(word);
		logger.info("password is entered");

		lp.clickOnLoginButton();
		logger.info("clicked on login button");

		String title = driver.getTitle();

		System.out.println("TITLE=" + title);

		Assert.assertEquals(title, "Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com");
	}

}
