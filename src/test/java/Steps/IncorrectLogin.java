package Steps;

import Pages.LoginPage;
import base.testBase;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class IncorrectLogin extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Then("^I see an error \"([^\"]*)\" message details$")
    public void iSeeAnErrorMessageDetails(String ErrorMessage) throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
//        String ExpectedMessage = ErrorMessage;
//        String ActualErrorMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
//        System.out.println(ActualErrorMessage);
//        Assert.assertEquals(ExpectedMessage, ActualErrorMessage);
//        String ExpectedMessage = "Password is required";
//        String ActualMessage =driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
//        ExpectedMessage.equals(ActualMessage);
//        System.out.println(ActualMessage);
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.click_Login();
        loginpage.verify_error();

    }

}

