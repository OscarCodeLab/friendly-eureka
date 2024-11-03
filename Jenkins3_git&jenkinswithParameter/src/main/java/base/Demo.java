package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Demo {

	WebDriver driver;
	Properties prop;

	public Demo() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void setup() {
		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		// driver.get(prop.getProperty("url"));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
