package marathon3.basePom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ServiceCommon extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<ChromeDriver> tldriver= new ThreadLocal<ChromeDriver>();
	
	public void setdriver(ChromeDriver driver) {
		tldriver.set(driver);
		
	}
	
	public ChromeDriver getdriver() {
		return tldriver.get();
	}

	
	
//public static ChromeDriver driver;
public static Shadow shadow;
public static String text2;
	
@BeforeMethod
public void preconditions() throws IOException {
	//1. Launch ServiceNow application
			WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();
			setdriver(new ChromeDriver());
			getdriver().get("https://dev141581.service-now.com"); 
			getdriver().manage().window().maximize();
			getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			//2. Login with valid credentials username and password 
			//   Create your own credentials
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream(new File("src/main/resources/Servicenowlogin.properties"));
			prop.load(fis);
			getdriver().findElement(By.id("user_name")).sendKeys(prop.getProperty("username"));
			getdriver().findElement(By.id("user_password")).sendKeys(prop.getProperty("password"));
			getdriver().findElement(By.id("sysverb_login")).click();

}
	
@AfterMethod
public void postconditions() {
	getdriver().close();
}
}
