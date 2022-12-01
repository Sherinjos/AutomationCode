package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      GooglePage gp = new GooglePage(driver);
      
      driver.navigate().refresh();
      
      gp.search("Phone");

	}

}
