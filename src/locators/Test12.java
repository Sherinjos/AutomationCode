package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.com/");
	   driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	   driver.findElement(By.name("email")).sendKeys("sherinjoseph1504@gmail.com");
	   driver.findElement(By.id("continue")).click();
	   driver.findElement(By.name("password")).sendKeys("Sherin@1504");
	   driver.findElement(By.id("signInSubmit")).click();
	}

}
