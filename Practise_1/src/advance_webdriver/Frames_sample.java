package advance_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_sample {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open Kesinenitravel URL
		driver.get("https://www.toyota.co.uk/order-a-brochure");
		// maximise browser
		driver.manage().window().maximize();
		//Connect to default content and switch to frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(".//*[@id='delivery_method']/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(".//*[@id='car_models']/div/ul/li[3]/div/img")).click();
		String str1=driver.findElement(By.xpath(".//*[@id='car_models']/div/ul/li[3]/div/img")).getText();
		System.out.println(str1);
		
		
		

	}

}
