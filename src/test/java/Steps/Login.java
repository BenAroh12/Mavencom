package Steps;



import Pages.CommonPage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import base.testBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Login extends testBase {

    @Before
    public  void setup() throws IOException {
        initialize();
    }
    @When("^I click SignIn Button$")
    public void i_click_SignIn_Button() throws Throwable {
//        driver.findElement(By.linkText("Sign in")).click();
        CommonPage commonpage = PageFactory.initElements(driver, CommonPage.class);
        commonpage.click_sign_in();
        Thread.sleep(2000);
    }

    @And("^I enter user email \"([^\"]*)\" details$")
    public void iEnterUserEmailDetails(String email) throws Throwable {
//        driver.findElement(By.id("email")).sendKeys(email);
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_email(email);
    }

    @And("^I enter user password \"([^\"]*)\" details$")
    public void iEnterUserPasswordDetails(String password) throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
//        driver.findElement(By.id("passwd")).sendKeys(password);
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_password(password);

    }

    @And("^I click the Login Button$")
    public void iClickTheLoginButton() throws Throwable {
//        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.click_Login();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() throws Throwable {
//        String NameofUser= driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
//        System.out.println(NameofUser);
        MyAccountPage myaccountpage = PageFactory.initElements(driver, MyAccountPage.class);
        myaccountpage.verify_account_user();

    }

    @And("^I sign out$")
    public void iSignOut() throws Throwable {
//        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a"));
        MyAccountPage myaccountpage = PageFactory.initElements(driver, MyAccountPage.class);
        myaccountpage.click_sighout_user();

    }





}



