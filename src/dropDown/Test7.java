package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropdown);
		s.selectByIndex(13);
		s.selectByValue("625");
		s.selectByVisibleText("Books");
		
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
