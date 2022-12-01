package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement radiobtn = driver.findElement(By.name("sex"));
		if(radiobtn.isSelected()) {
			System.out.println("Pass:element is selected");
			radiobtn.click();
		}
		else {
			System.out.print("Fail:element is not selected");
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
