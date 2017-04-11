package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Second_program {
	  WebDriver driver;  
  @Test
  public void f() {
	// provide username
				driver.findElement(By.id("email")).sendKeys("birram.sirisha@gmail.com");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// provide password
				driver.findElement(By.id("pass")).sendKeys("asdfg");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				// click on login
				driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
	
  }
  @BeforeClass
  public void beforeClass() {
	  
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open facebook URL
		driver.get("https://facebook.com");
		// maximise browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  				  
  }

}
