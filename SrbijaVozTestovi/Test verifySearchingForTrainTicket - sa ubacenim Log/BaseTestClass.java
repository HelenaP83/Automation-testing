package testClasses;

import java.time.Duration;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


import pageClasses.SrbijaVozHome_pageClass;
import pageClasses.SrbijaVozLogin_pageClass;

public class BaseTestClass {

	WebDriver driver;
	WebDriverWait wait;
	SrbijaVozHome_pageClass homePage;
	SrbijaVozLogin_pageClass loginPage;
	public Logger logger;

	@BeforeClass
	public void initialization() {
		
		logger= LogManager.getLogger(this.getClass());
			
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		homePage = new SrbijaVozHome_pageClass(driver);
		loginPage = new SrbijaVozLogin_pageClass(driver);
	}

	@AfterClass
	public void closeDriver() {
		driver.quit();
	}

}
