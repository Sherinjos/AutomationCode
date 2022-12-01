package autoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchtb = driver.findElement(By.id("twotabsearchtextbox"));
		searchtb.sendKeys("Phone");
		
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		
		//count of the options
		System.out.println(ele.size());
		
		//Print the text
		for(WebElement b:ele) {
			 System.out.println(b.getText());
		}
		 driver.close();
	}
	
}
