package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		//Switching control to frame
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		driver.findElement(By.id("userName")).sendKeys("7550131087");
		driver.findElement(By.id("close-pop")).click();
		
		//Switching control back from frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("keyword")).sendKeys("Phone");
	}


}
