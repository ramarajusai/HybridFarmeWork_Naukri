package com.Hybrid_FrameWork.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Hybrid_FrameWork.Utilities.ReadConfig;

public class BaseClass {
	ReadConfig rc = new ReadConfig();
	public String username = rc.getUserName();
	public String url = rc.getApplicationUrl();
	public String word = rc.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void initBrowser(String br) {
		logger = Logger.getLogger("naukri");// for the logs
		PropertyConfigurator.configure("Log4j.properties");// for the logs

		if (br.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C://Users//DELL//eclipse-workspace//Hybrid_FrameWork//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (br.equals("ie")) {

			System.out.println("execute IE browser");

		}

		else {

			System.out.println("execute firefox browser");
		}

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();

	}
}
