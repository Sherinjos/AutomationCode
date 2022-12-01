package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test5 {
	
	public static WebDriver driver;    //Global declaration
	public static WebDriver driver1;   //Global declaration

	public static void main(String[] args) {
		driver = new ChromeDriver();
		demo(driver);
		driver1 = new FirefoxDriver();
		Test5.demo(driver1);
		
	}
	//Polymorphism with upcasting statement
	public static void demo(WebDriver driver) { 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	

}
