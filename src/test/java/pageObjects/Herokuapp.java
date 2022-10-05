package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Herokuapp {
	
	WebDriver driver;
	
	public Herokuapp(WebDriver driver )  {
		this.driver = driver;
		
		
	}
	
	By checkboes = By.xpath("//*[contains(text(),'Checkboxes')]");
	By checkbox1 = By.xpath("//*[@id='checkboxes']/input[1])]");
	
	public void clickcheckboxlink()
	
	{
		driver.findElement(checkboes).click();
	}
	
}
