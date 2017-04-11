package facebooklogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklaunch {

	public static void main(String[] args) {
	
		WebDriver driver;
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open facebook URL
		driver.get("https://facebook.com");
		// maximise browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// provide username
		driver.findElement(By.id("email")).sendKeys("birram.sirisha@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// provide password
		driver.findElement(By.id("pass")).sendKeys("asdfg");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// click on login
		driver.findElement(By.id("u_0_p")).click();
		
		
		}

}
