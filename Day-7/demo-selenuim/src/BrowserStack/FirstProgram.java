package BrowserStack;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
			driver.get("https://demoqa.com/automation-practice-form");
			//System.out.println("Title: " + driver.getTitle());
//			driver.findElement(By.className("suggestor-input")).sendKeys("amdocs");
			Actions builder=new Actions(driver);
			//WebElement ele=driver.findElement(By.xpath(".//*[@id='gender-radio-1']"));
			//WebElement ele=driver.findElement(By.id("gender-radio-1"));
			WebElement ele=driver.findElement(By.id("react-select-3-input"));
			ele.sendKeys("Haryana");
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id^='react-select-3-option']")));
			WebElement suggestions=driver.findElement(By.xpath("//div[@id='react-select-3-option-2']"));
//			builder.moveToElement(ele).build().perform();
//			
//			builder.click(ele).build().perform();
					
			//suggestions.click();
			
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", suggestions);
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", suggestions);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			driver.quit();
		}
		
	}

}
