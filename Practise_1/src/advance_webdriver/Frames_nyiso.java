package advance_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_nyiso {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open nyiso URL
		driver.get("http://mis.nyiso.com/public/");
		// maximise browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Connect to default content and switch to frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		 driver.findElement(By.xpath("html/body/table/tbody/tr[6]/td/a")).click();
		 driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			Thread.sleep(3000);
		 String str=driver.findElement(By.xpath("html/body/table/tbody/tr[8]/td[2]/span")).getText();
		 System.out.println(str);
		 

	}

}
