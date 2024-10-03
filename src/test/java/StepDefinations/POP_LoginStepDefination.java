package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;

public class POP_LoginStepDefination {
	
WebDriver driver;
loginPage login;
@Given("User is on login page")
public void user_is_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("http://www.saucedemo.com/v1/");
}

@When("User enters valid {string} and {string}")
public void user_enters_valid_user_name_and_password(String username, String password) {
   // driver.findElement(By.id("user-name")).sendKeys(username);
   // driver.findElement(By.id("password")).sendKeys(password);
	
	login = new loginPage(driver);
	login.enterUserName(username);
	login.enterPassword(password);
}

@And("Click on login button")
public void click_on_login_button() {
   // driver.findElement(By.id("login-button")).click();
	
	login.clicLogin();
}

@Then("User is navigated to home page")
public void user_is_navigated_to_home_page() {
    
	//Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User is navigated to home page");
	login.isLogoDisplay();
}

@And("Close the browser")
public void close_the_browser() {
    // Write code here that turns the phrase above into concrete actions
    driver.close();
}


}
