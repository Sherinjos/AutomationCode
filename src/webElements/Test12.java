package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchtf = driver.findElement(By.name("q"));
		if(searchtf.isDisplayed()) {
			System.out.println("Pass:element is diplayed");
			searchtf.sendKeys("Selenium");
		}
		else {
			System.out.println("Fail:element is not displayed");
		}
		Thread.sleep(3000);
		driver.close();

	}

}
