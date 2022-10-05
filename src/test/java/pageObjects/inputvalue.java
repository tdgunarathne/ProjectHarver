package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class inputvalue {

	WebDriver driver;
	
	public inputvalue(WebDriver driver )  {
		this.driver = driver;
		
		
	}
	
	By inputs = By.xpath("//*[contains(text(),'Inputs')]");
	By numberinput = By.xpath("//*[@id='content']/div/div/div/input)]");
	
	public void clickinputslink()
	
	{
		driver.findElement(inputs).click();
	}
	
	public void inputnumber(String searchinput) {
		
		driver.findElement(numberinput).sendKeys(searchinput);
	}
	
	
	
	
	
	
}
