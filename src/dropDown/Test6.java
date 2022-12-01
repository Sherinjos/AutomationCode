package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rishi/OneDrive/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("MTR"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		s.selectByValue("C");
		s.selectByVisibleText("Dosa");
		
		System.out.println(s.isMultiple());
		
		Thread.sleep(3000);
		if(s.isMultiple()) {
			s.deselectAll();
		}
		else {
			System.out.println("It is not a multi select dropdown");
		}
		driver.close();
	}

}
