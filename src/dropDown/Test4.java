package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

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
		
		List<WebElement> opt = s.getAllSelectedOptions();
		System.out.println(opt.size());
		
		for(WebElement b:opt)
		{
			System.out.println(b.getText());
		}
		
		Thread.sleep(3000);
		s.deselectByIndex(1);
		Thread.sleep(3000);
		s.deselectByValue("C");
		Thread.sleep(3000);
		s.selectByVisibleText("Dosa");
		
		driver.close();
	}
}