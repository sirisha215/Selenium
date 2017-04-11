package advance_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Cross_Browser_Testing {
	 WebDriver driver;
  @Test
  public void f() {
	 
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open facebook URL
		driver.get("https://facebook.com");
		// maximise browser
		driver.manage().window().maximize();
  }
  @Parameters("Browser")
  @BeforeTest
  public void beforeTest(String Browser) {
	  try {
		  if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\a1103650\\workspace\\geckodriver.exe");
			driver = new FirefoxDriver();
		}  else if (Browser.equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// FileOrDriverPathOf("ChromeDriverpath"));
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("IE")) {
			// System.setProperty("webdriver.ie.driver",
			// FileOrDriverPathOf("IEDriverpath"));
			System.setProperty("webdriver.ie.driver", "C:\\Users\\a1103650\\Documents\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			// DesiredCapabilities capabilities =
			// DesiredCapabilities.internetExplorer();
			driver = new InternetExplorerDriver(capabilities);
		}
	} catch (WebDriverException e) {
		System.out.println(e.getMessage());
	}
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  System.out.println("testing new enhancement");
  }
  
  

}
