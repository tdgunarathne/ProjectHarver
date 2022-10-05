package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fromAutontication {


WebDriver driver;



public fromAutontication(WebDriver driver) {
	this.driver = driver;

}

By autonticationlink = By.xpath("//*[contains(text(),'Form Authentication')]");
By username = By.xpath("//input[@id='username']");
By password = By.xpath("//input[@id='password']");
By login = By.xpath("//*[@id='login']/button/i");

public void clickautonticationlink()

{
	driver.findElement(autonticationlink).click();
}

public void giveusername(String searchinput)

{
	driver.findElement(username).sendKeys(searchinput);
}


public void givepassword(String searchinput)

{
	driver.findElement(password).sendKeys(searchinput);
}

public void clickloginbutton()

{
	driver.findElement(login).click();
}
}
