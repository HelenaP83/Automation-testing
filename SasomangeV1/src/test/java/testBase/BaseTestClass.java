package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.HomePage;
import pageObjects.RegistracijaPage;
import pageObjects.Uloguj_se_Page;

public class BaseTestClass {
	public WebDriver driver;
	public WebDriverWait wait;
	public Properties properties;
	public HomePage hp;
	public RegistracijaPage rp;
	public Uloguj_se_Page ulogujp;

	@BeforeClass
	public void setupInitialization() throws IOException {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://sasomange.rs/");
		hp = new HomePage(driver);
		rp = new RegistracijaPage(driver);
		ulogujp = new Uloguj_se_Page(driver);

		FileReader file = new FileReader("./src//test//resources//conf.properties");
		properties = new Properties();
		properties.load(file);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

	public String randomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}

	public String randomAlphaNumeric() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		String generatedNumber = RandomStringUtils.randomNumeric(3);
		return (generatedNumber + "&" + generatedString);
	}

}
