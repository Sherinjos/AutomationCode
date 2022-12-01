package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement button = driver.findElement(By.xpath("//label[text()='Female']"));
		if(button.isEnabled()) {
			System.out.print("Pass:button is enabled");
		}
		else {
			System.out.println("Fail:element is not enbaled");
		}
		driver.close();

	}

}
