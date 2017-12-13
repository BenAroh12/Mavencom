package Steps;


import Pages.ForgotPasswordPage;
import Pages.LoginPage;
import base.testBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ForgotPassword extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @And("^I click forgot password Link$")
    public void iClickForgotPasswordLink() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
//        driver.findElement(By.linkText("Forgot your password?")).click();
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.click_forgot_password();
    }


    @When("^I click retrieve password button$")
    public void iClickRetrievePasswordButton() throws Throwable {
//        driver.findElement(By.cssSelector("#form_forgotpassword > fieldset > p > button > span")).click();
        ForgotPasswordPage forgotpasswordpage = PageFactory.initElements(driver, ForgotPasswordPage.class);
        forgotpasswordpage.click_retrieve_password();

    }


}




