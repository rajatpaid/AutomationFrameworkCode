package product_friegt_basepackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import comfssdomainpageobjects.AdminSignInPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class TestBase {
	public static  WebDriver driver;


	@BeforeTest
	public void initializeChrome() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new  ChromeOptions ();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option );
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		/*
		 * WebDriverManager.edgedriver().setup(); WebDriver driver = new EdgeDriver();
		 * driver.get(Constants.URL);
		 * driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 * driver.manage().window().maximize();
		 */
	}
	public void failed() throws IOException {

		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("C:\\Users\\naras\\eclipse-workspace\\Product_Frieght_Adda\\test-output\\screnshots\\screenshot1.jpg"));
	}
	@AfterTest 
	public void tearDown() {
		//driver.close();

	}

}