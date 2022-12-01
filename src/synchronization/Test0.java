package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		w.until(ExpectedConditions.visibilityOf(user)).sendKeys("sherinjoseph1504@gmail.com");
		
	    WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
	    w.until(ExpectedConditions.visibilityOf(pswd)).sendKeys("Sherin@1504");
		
	
	    WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	    w.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		
		String title = driver.getTitle();
		w.until(ExpectedConditions.titleContains("Flipkart"));
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
