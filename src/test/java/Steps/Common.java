package Steps;


import Pages.HomePage;
import base.testBase;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Common extends testBase {

    @Before
    public void setup() throws IOException{
        initialize();
    }

    @Given("^I am on the Home Page$")
    public void iAmOnTheHomePage() throws Throwable {
        driver.manage().deleteAllCookies();
        driver.navigate().to("http://automationpractice.com/");
    }

    @And("^I see a Logo Banner$")
    public void iSeeALogoBanner() throws Throwable {
//        driver.findElement(By.id("header_logo")).isDisplayed();
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.verify_logo();

    }
}



