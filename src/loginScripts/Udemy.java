package loginScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Udemy {

	public static void main(String[] args) throws InterruptedException {
		//Step:1 Open the browser
		WebDriver driver = new FirefoxDriver();
		
		//Step:2 Maximize the browser
		driver.manage().window().maximize();
		
		//Step:3 Enter the URL
		driver.get("https://www.udemy.com/join/login-popup");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Step:4 Enter the valid username
		driver.findElement(By.name("email")).sendKeys("abcdef");
		
		//Step:5 Enter the valid password
		driver.findElement(By.name("password")).sendKeys("abcd@123");
		
		//Step:6 Click on Login button
		driver.findElement(By.id("submit-id-submit")).click();
		
		//Step:7 Get the title for the application
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		//Step:8 Get the URL of the application
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//Step:9 Verification
		if(acttitle.contains("Login | Udemy")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		//Step:10 Close the application
		driver.close();

	}

}
