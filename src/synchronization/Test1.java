package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.name("username")).sendKeys("Sherin_jos");
		 driver.findElement(By.name("password")).sendKeys("Sherin@1504");
		 driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		 
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 
		 String acttitle = driver.getTitle();
		 System.out.println(acttitle);
		 
		 if(acttitle.contains("Instagram"))
		 {
			 System.out.println("Pass:Page is displayed");
		 }
		 else
		 {
			 System.out.println("Fail:Page is not displayed");
		 }
		 
		 driver.close();
		 }
}
		


