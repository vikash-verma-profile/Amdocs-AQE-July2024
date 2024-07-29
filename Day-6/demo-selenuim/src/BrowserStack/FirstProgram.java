package BrowserStack;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Test");
//		System.setProperty("webdriver.chrome.driver", "C:\\chrome-win64\\chrome.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\firefox-driver\\geckodriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		WebDriver driver=new ChromeDriver(options);
		WebDriver driver=new FirefoxDriver();
		try {
			
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//			driver.manage().window().maximize();
			driver.get("https://www.naukri.com");
			//System.out.println("Title: " + driver.getTitle());
			driver.findElement(By.className("suggestor-input")).sendKeys("amdocs");
			Actions builder=new Actions(driver);
			WebElement ele=driver.findElement(By.xpath(".//*[@class='qsbSubmit']"));
			builder.moveToElement(ele).build().perform();
			
			builder.click(ele).build().perform();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			driver.quit();
		}
		
	}

}
