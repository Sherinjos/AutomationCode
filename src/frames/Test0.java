package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("Core java for selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()=' Core Java For Selenium Trainin']")).click();
		driver.findElement(By.xpath("//a[text()='X']")).click();
		
		//Switching control to frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[@aria-label='Pause']")).click();
		
		//Switching control back from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Add To Wishlist']")).click();
	}

}
