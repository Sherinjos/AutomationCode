package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {

	//Declaration
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	
	//Initialization
	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void email(String mail) {
		emailtb.sendKeys(mail);
	}
	
	public void password(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void loginbutton() {
		loginbtn.click();
	}
	
	
}
	