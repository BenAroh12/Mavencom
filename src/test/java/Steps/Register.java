package Steps;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Register extends testBase {

    @Before
    public  void setup() throws IOException {
        initialize();
    }

    @When("^I type email address to create new user$")
    public void i_type_email_address_to_create_new_user() throws Throwable {
    random = 100 + (int) (Math.random() * ((1000-1)+1));
        driver.findElement(By.xpath("//*[@id=\'email_create\']")).sendKeys("lotamusomebi"+random+"@gmail.com");
    }

    @When("^I click create an account$")
    public void i_click_create_an_account() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
    }

    @Then("^I see Your Personal Information$")
    public void i_see_Your_Personal_Information() throws Throwable {
    String info = driver.findElement(By.cssSelector("#account-creation_form > div:nth-child(1) > h3")).getText();
//    Assert.assertEquals("YOUR PERSONAL INFORMATION", info);
    System.out.println(info);

    }

    @Then("^I select Mr$")
    public void i_select_Mr() throws Throwable {
    driver.findElement(By.id("id_gender1")).click();
    }

    @Then("^I enter first name in the first name input field$")
    public void i_enter_first_name_in_the_first_name_input_field() throws Throwable {
        driver.findElement(By.id("customer_firstname")).sendKeys("James");
    }

    @Then("^I enter last name in the last name input field$")
    public void i_enter_last_name_in_the_last_name_input_field() throws Throwable {
        driver.findElement(By.id("customer_lastname")).sendKeys("John");
    }

    @Then("^I see my email address$")
    public void i_see_my_email_address() throws Throwable {
        driver.findElement(By.id("email")).isDisplayed();
    }

    @Then("^I type password in the password input field$")
    public void i_type_password_in_the_password_input_field() throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys("benedith12");
    }

    @Then("^I enter date of birth$")
    public void i_enter_date_of_birth() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        Select ElementSelect = new Select(driver.findElement(By.id("days")));
        ElementSelect.selectByValue("1");

        Select ElementSelect1 = new Select(driver.findElement(By.id("months")));
        ElementSelect1.selectByValue("7");

        Select ElementSelect2 = new Select(driver.findElement(By.id("years")));
        ElementSelect2.selectByValue("2014");
    }

    @Then("^I select option to sign up for our newsletter$")
    public void i_select_option_to_sign_up_for_our_newsletter() throws Throwable {
        driver.findElement(By.id("newsletter")).click();
    }

    @Then("^I select option to receive special offers from our partners$")
    public void i_select_option_to_receive_special_offers_from_our_partners() throws Throwable {
        driver.findElement(By.id("optin")).click();
    }

    @Then("^I see Your Address$")
    public void i_see_Your_Address() throws Throwable {
        String address = driver.findElement(By.cssSelector("#account-creation_form > div:nth-child(2) > h3")).getText();
        System.out.println(address);
    }

    @Then("^I type first name in the first name input field$")
    public void i_type_first_name_in_the_first_name_input_field() throws Throwable {
        driver.findElement(By.id("firstname")).sendKeys("James");
    }

    @Then("^I type last name in the last name input field$")
    public void i_type_last_name_in_the_last_name_input_field() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.id("lastname")).sendKeys("John");
    }

    @Then("^I enter company name in the company input field$")
    public void i_enter_company_name_in_the_company_input_field() throws Throwable {
        driver.findElement(By.id("company")).sendKeys("Software Talent");
    }

    @Then("^I enter company address in the address input field$")
    public void i_enter_company_address_in_the_address_input_field() throws Throwable {
        driver.findElement(By.id("address1")).sendKeys("6 High Street");
    }

    @Then("^I enter the city$")
    public void i_enter_the_city() throws Throwable {
        driver.findElement(By.id("city")).sendKeys("Austin");
    }

    @Then("^I enter the state$")
    public void i_enter_the_state() throws Throwable {
        Select ElementSelect = new Select(driver.findElement(By.id("id_state")));
        ElementSelect.selectByValue("43");
    }

    @Then("^I enter the postal code in the postal code field$")
    public void i_enter_the_postal_code_in_the_postal_code_field() throws Throwable {
        driver.findElement(By.id("postcode")).sendKeys("78754");
    }

    @Then("^I select the country$")
    public void i_select_the_country() throws Throwable {
        Select ElementSelect = new Select(driver.findElement(By.id("id_country")));
        ElementSelect.selectByValue("21");
    }

    @Then("^I enter additional information$")
    public void i_enter_additional_information() throws Throwable {
        driver.findElement(By.id("other")).sendKeys("Shopping for Xmas");
    }

    @Then("^I enter mobile phone$")
    public void i_enter_mobile_phone() throws Throwable {
        driver.findElement(By.id("phone")).sendKeys("512-471-3434");
    }

    @Then("^I enter my address in the assign an address alaias for future reference$")
    public void i_enter_my_address_in_the_assign_an_address_alaias_for_future_reference() throws Throwable {
        driver.findElement(By.id("alias")).sendKeys("6 High Street");
    }

    @Then("^I click the Register Button$")
    public void i_click_the_Register_Button() throws Throwable {
     driver.findElement(By.id("submitAccount")).click();
    }

    @Then("^I should be register successfully$")
    public void i_should_be_register_successfully() throws Throwable {
        String NameUser= driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        System.out.println(NameUser);
    }

    @Then("^I click on sign out to return to sign in page$")
    public void i_click_on_sign_out_to_return_to_sign_in_page() throws Throwable {
        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a")).click();
    }

}
