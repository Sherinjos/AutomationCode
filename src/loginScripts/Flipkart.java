package loginScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		//Step:1 Open the browser
		WebDriver driver = new ChromeDriver();
		
		//Step:2 Maximize the browser
		driver.manage().window().maximize();
		
		//Step:3 Enter the URL
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Step:4 Enter the valid username
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sherinjoseph1504@gmail.com");
		
		//Step:5 Enter the valid password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sherin@1504");
		
		//Step:6 Click on Login button
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		//Step:7 Get the title for the application
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
	
		//Step:8 Get the URL of the application
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Step:9 Verification
		if(acttitle.contains("Online Shopping Site for Mobiles,")) {
			System.out.println("Pass: Home page is displayed");
		}
		else
		{
			System.out.println("Fail: Home page is not displayed");
		}
		
		//Step:10 Close the application
		driver.close();
		

	}

}
