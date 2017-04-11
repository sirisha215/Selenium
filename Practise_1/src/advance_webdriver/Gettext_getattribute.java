package advance_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Gettext_getattribute {

	public static void main(String[] args) {
		 WebDriver driver;
			// chrome browser open
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
			driver = new ChromeDriver();
			// open facebook URL
			driver.get("https://www.google.co.in/");
			// maximise browser
			driver.manage().window().maximize();
			
			String abc=driver.findElement(By.name("btnK")).getAttribute("aria-label");
			System.out.println(abc);
			String xyz="Google Search";
			Assert.assertEquals(abc, xyz);
			System.out.println("Aria label is displaying correct");
			
			WebElement GS=driver.findElement(By.xpath("//*[@id='gbwa']/div[1]/a"));
			Actions act=new Actions(driver);
			act.moveToElement(GS).click().build().perform();
			
			
			
			
			

	}

}
