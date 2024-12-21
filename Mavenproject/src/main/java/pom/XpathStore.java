package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XpathStore {
	
	private WebDriver d;
	
	//Constructor is acting like SETTER Method
	XpathStore(WebDriver d)
	{
		this.d=d;
	    PageFactory.initElements(d, this);
	}
	
	@FindBy (xpath="//input[@placeholder='Username']")
    WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(.,'Login')]")
	WebElement LoginButton;
	
	

}
