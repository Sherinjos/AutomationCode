package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb = driver.findElement(By.id("twotabsearchtextbox"));
		if(searchtb.isDisplayed()) {
			System.out.println("Pass:elemelemenent is displayed");
			searchtb.sendKeys("Phone");
		}
		else {
			System.out.println("Fail:element is not displayed");
		}
		Thread.sleep(3000);
		driver.close();
		}

	}

