package windowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//full screen
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		//minimize
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		//close
		driver.close();
		
	}

}
