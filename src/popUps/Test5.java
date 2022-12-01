package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.selenium.dev/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.findElement(By.xpath("//span[text()='Downloads']")).click();
       driver.findElement(By.xpath("//a[text()='4.5.0']")).click();

	}

}
