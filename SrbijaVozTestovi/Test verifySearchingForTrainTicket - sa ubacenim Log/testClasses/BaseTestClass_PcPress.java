package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import pageClasses.PcProdavnicaPageClass;
import pageClasses.PcProdavnica_NarucenoPage;

public class BaseTestClass_PcPress {
	WebDriver driver;
	WebDriverWait wait;
	PcProdavnicaPageClass prodavnicaPage;
	PcProdavnica_NarucenoPage narucenoPage;
	
	@BeforeClass
	public void initialization() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	     prodavnicaPage = new PcProdavnicaPageClass(driver);
		narucenoPage = new PcProdavnica_NarucenoPage(driver);
	}
	

	@AfterClass
	public void closeDriver() {
		driver.quit();
	}
}

