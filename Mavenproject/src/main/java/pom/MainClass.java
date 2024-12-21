package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		XpathStore st=new XpathStore(d);
		
		st.username.sendKeys("Admin");
		Thread.sleep(2000);
		
		st.password.sendKeys("admin123");
		Thread.sleep(2000);
		
		st.LoginButton.click();
		Thread.sleep(2000);
		
		
		
		
	}

}
