package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Forgotpassword {
	
WebDriver driver;
	
		

	public Forgotpassword(WebDriver driver) {
		this.driver = driver;
	
	}

	By password = By.xpath("//*[contains(text(),'Forgot Password')]");
	By email = By.xpath("//input[@id='email']");
	By retrievebutton = By.xpath("//input[@id='email']");
	
	public void clickpasswordlink()
	
	{
		driver.findElement(password).click();
	}
	
	public void giveemail(String searchinput)
	
	{
		driver.findElement(email).sendKeys(searchinput);
	}
	
	public void clickretrivepassword()
	
	{
		driver.findElement(retrievebutton).click();
	}
}


