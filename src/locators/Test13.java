package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
		// username
		driver.findElement(By.name("username")).sendKeys("Sherin_jos");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Sherin_jos");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Sherin_jos");
		
		// password
		driver.findElement(By.name("password")).sendKeys("Sherin_jos");

	}

}
