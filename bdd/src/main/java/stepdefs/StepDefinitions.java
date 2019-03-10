package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
WebDriver driver=null;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		//System.out.println("1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRIDHAR\\eclipse-workspace\\Training\\bdd\\Drivers\\chrome\\chromedriver.exe");
	driver = new ChromeDriver(); 
		 driver.get("http://www.facebook.com");
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
		//System.out.println("2");
		driver.findElement(By.id("email")).sendKeys("saisriuk@gmail.com");
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
		//System.out.println("3");
			driver.findElement(By.id("pass")).sendKeys("Subbarao1");
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		//System.out.println("4");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		/*//*[@id='u_0_8']*/
		
	}

	@Then("^User logged in successfully$")
	public void user_logged_in_successfully() throws Throwable {
		//System.out.println("5");
		driver.findElement(By.xpath("//div[@class='_6qfu _5lxt f_click']")).click();
		//driver.findElement(By.xpath("//body[@class='fbIndex UIPage_LoggedOut _-kb _61s0 _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_GB cores-gte4 hasAXNavMenubar _19_u']")).click();
		
	}
}