package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
WebDriver driver;
	
	
	
	public dropdown(WebDriver driver) {
		this.driver = driver;
		
	}

	By dropdown = By.xpath("//*[contains(text(),'Dropdown')]");
	By selectOption = By.xpath("//*[@id='dropdown']");
	
	public void clickdropdownlink()
	
	{
		driver.findElement(dropdown).click();
	}
	
	public void selectdropdown()
	{
		Select dropdown = new Select(driver.findElement(By.id("selectOption")));  
		dropdown.selectByVisibleText("Option 1");  
	}
}
