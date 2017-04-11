package advance_webdriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static WebDriver driver;
	//static String Time="";
public static void Takescreenshot(String name) throws IOException
{
	DateFormat df=new SimpleDateFormat("YYYY_MMM_dd HH:mm:ss");
	Date dt = new Date();
	String Time=df.format(dt);
	System.out.println(dt);
	//Tue Feb 14 20:53:31 CST 2017
	System.out.println(Time);
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\a1103650\\Documents\\Automation Class Videos\\screenshots\\"+name+Time+".jpg"));
	
	
	
}

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open Kesinenitravel URL
		driver.get("http://www.collegeweeklive.com/");
		// maximise browser
		driver.manage().window().maximize();
		//Takescreenshot("Collegeweeklive");
		Date dt = new Date();
		System.out.println(dt);
		//Tue Feb 14 20:53:31 CST 2017
		DateFormat df=new SimpleDateFormat("YYYY_MMM_dd HH:mm:ss");
		 String Time1=df.format(dt);
		System.out.println(Time1);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File("C:\\Users\\a1103650\\Documents\\Automation Class Videos\\screenshots\\", "College"+Time1+".jpg");
		FileUtils.copyFile(f,targetFile);
		
		
		

	}

}
