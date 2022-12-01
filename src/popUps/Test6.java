package popUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test6 {

	public static void main(String[] args) {

		//Chrome Browser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		//Firefox Browser
		//FirefoxOptions options = new FirefoxOptions();
		//options.addArguments("--disable-notifications");
		//WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
