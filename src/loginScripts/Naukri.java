package loginScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("usernameField")).sendKeys("sherinjoseph1504@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Sherin@1504");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(acttitle.contains("Jobseeker's Login: Search the Best Jobs available in India ")){
			System.out.println("Pass:Page is displayed");
			}
	    else
	    	{
				 System.out.println("Fail:Page is not displayed");
	    	}
		driver.close();
	}
}
			 
		
		
