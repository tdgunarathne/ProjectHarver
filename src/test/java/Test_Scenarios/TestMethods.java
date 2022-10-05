package Test_Scenarios;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Forgotpassword;
import pageObjects.Herokuapp;
import pageObjects.dropdown;
import pageObjects.fromAutontication;
import pageObjects.inputvalue;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;



public class TestMethods {
	WebDriver driver;

@BeforeTest
public void beforetest() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	
	driver.get("https://the-internet.herokuapp.com/");
	
}

	@Test
	public void checkboxoperation() {
		
		Herokuapp page = new Herokuapp(driver); 
		page.clickcheckboxlink();
	}
	
	@Test
	public void dropdownoperation( ) {
		
		dropdown page = new dropdown(driver);
		page.clickdropdownlink();
		page.selectdropdown();
	}


	@Test
	public void forgotpasswordoperation( ) {
		
		
		Forgotpassword page = new Forgotpassword(driver);
		page.clickpasswordlink();
		page.giveemail("test@gmail.com");
		page.clickretrivepassword();
	}
	
	
	@Test
	public void fromautonticationoperation( ) {
		
		fromAutontication page = new fromAutontication(driver);
		page.clickautonticationlink();
		page.giveusername("test");
		page.givepassword("test");
		page.clickloginbutton();
		
	}
	
	@Test
	public void inputvalueperation( ) {
	
		inputvalue page = new inputvalue(driver);
		page.clickinputslink();
		page.inputnumber("2345");
	;
	}
	@AfterTest
	public void aftertest() {
		
		driver.quit();
	}

}
