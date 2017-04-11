package justrechargeit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
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

public class Cross_Browser_testing {
	 WebDriver driver;
 @Test(priority=1)
 public void login() {
		// open justreacharge URL
		driver.get("https://www.justrechargeit.com/");
		// maximise browser
		driver.manage().window().maximize();
		driver.findElement(By.id("jriTop_signin9")).click();
		driver.findElement(By.id("txtUserName")).sendKeys("birram.sirisha@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		driver.findElement(By.id("imgbtnSignin")).click();
		
 }
 @Test(priority=2)
 public void addmobile_no() throws IOException, JXLException, Exception {
	  String path = "C:/Users/a1103650/workspace/testdata.xls";
		FileInputStream R = new FileInputStream(path);
		Workbook w = Workbook.getWorkbook(R);
		Sheet S = w.getSheet("mobile no");
		//driver.findElement(By.id("txtMobileNickName")).sendKeys("Dad");
		if (driver.findElement(By.id("btnAddServices")).isEnabled()) {
			
			System.out.println("Add button is clickable");
			
			
		} else {
			System.out.println("Add button is not clickable");

		} 
		
		
		 //Entered mobile number details should add in the table
		
		for (int i = 1; i < S.getRows(); i++){
			
			driver.findElement(By.xpath(".//*[@id='divLnkAddMobile']/a")).click();
			Thread.sleep(2000);
		
		driver.findElement(By.id("txtpopMobileNo")).sendKeys(S.getCell(1, i).getContents());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// provide password
		driver.findElement(By.id("txtpopMobileNickname")).sendKeys(S.getCell(0, i).getContents());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// click on login
		driver.findElement(By.id("btnPopupAddMobile")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='btnPopupAddMobile']")).click();
		Thread.sleep(3000);
		}
	  
	  
	  
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
 }

}