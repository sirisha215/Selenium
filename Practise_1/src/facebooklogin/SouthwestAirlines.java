package facebooklogin;

import org.openqa.grid.internal.utils.configuration.converters.CustomConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SouthwestAirlines {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open Kesinenitravel URL
		driver.get("https://www.southwest.com/");
		// maximise browser
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/a[2]")).click();
		driver.findElement(By.id("js-customer-first-name")).sendKeys("Sirisha");
		Thread.sleep(3000);
		driver.findElement(By.id("js-customer-last-name")).sendKeys("Birram");
		
		//new Select(driver.findElement(By.xpath("//*[@id="customer.suffix"]"))).selectByVisibleText("SR");
			
		Thread.sleep(3000);
		// Date of Birth
		new Select(driver.findElement(By.id("js-customer-birth-month")))
				.selectByVisibleText("Jun");
		new Select(driver.findElement(By.id("js-customer-birth-day")))
				.selectByVisibleText("8");
		new Select(driver.findElement(By.id("js-customer-birth-year")))
				.selectByVisibleText("2000");

		// Gender
		new Select(driver.findElement(By.id("js-customer-gender")))
				.selectByIndex(1);

		// SSN
		driver.findElement(By.id("js-last-four-ssn")).sendKeys("9999");

		// Select Country
		new Select(driver.findElement(By.id("js-country"))).selectByVisibleText("UNITED STATES OF AMERICA");
		
		driver.findElement(By.id("contactInfo.addresses[0].addressType0")).click();
		
		//Street Address
		driver.findElement(By.id("js-contact-info-address1")).sendKeys("7201 York Ave S");
		driver.findElement(By.id("js-contact-info-address2")).sendKeys("APT 111");
		driver.findElement(By.id("js-contact-info-city")).sendKeys("Edina");
		new Select(driver.findElement(By.id("js-contact-info-state"))).selectByVisibleText("Minnesota");
		driver.findElement(By.id("js-contact-info-zip")).sendKeys("55435");
		
		Thread.sleep(3000);
	
		// Contact Information
		driver.findElement(By.id("js-us-area-code")).sendKeys("612");
		driver.findElement(By.id("js-us-prefix-number")).sendKeys("991");
		driver.findElement(By.id("js-us-line-number")).sendKeys("0567");
		driver.findElement(By.id("js-contact-email")).sendKeys("birram.sirisha@gmail.com");
		driver.findElement(By.id("js-contact-email-confirmation")).sendKeys("birram.sirisha@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.id("js-username")).sendKeys("Sirisha_1");
		driver.findElement(By.id("account.password")).sendKeys("aaaa$215");
		driver.findElement(By.id("js-password-confirmation")).sendKeys("aaaa$215");
		
		new Select(driver.findElement(By.id("js-security-question-1"))).selectByVisibleText("What was the color of your first car?");
		driver.findElement(By.id("js-security-answer-1")).sendKeys("RED");
		
		new Select(driver.findElement(By.id("js-security-question-2"))).selectByVisibleText("What is the name of the city in which you were born?");
		driver.findElement(By.id("js-security-answer-2")).sendKeys("Sathupally");
		
		driver.findElement(By.id("js-account-type-customer")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
