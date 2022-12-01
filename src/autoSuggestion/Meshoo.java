package autoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meshoo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		searchtb.sendKeys("Kurti");
		
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='SingleLine__SingleLineStyled-xjyutt-0 eWepTT']"));
		//Count of the options
		System.out.println(ele.size());
		
		//Print the text
		for(WebElement b : ele) {
			System.out.println(b.getText());
		}
		driver.close();

	}

}
