package loginScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.id("username")).sendKeys("sherinjoseph1504@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Treasure@1504");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String atitle=driver.getTitle();
		System.out.println(atitle);
		
		if(atitle.contains("Feed")) {
			System.out.println("Pass:Home Page is displayed");
		}
		else
		{
			System.out.println("Fail:Home Page is not displayed");
		}
		driver.close();

	}

}
