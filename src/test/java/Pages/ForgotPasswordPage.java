package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordPage {

    @FindBy(how= How.CSS, using="#center_column > ul > li > a > span")
    public static WebElement backlogin;

    @FindBy(how= How.ID, using="email")
    public static WebElement myemail;

    @FindBy(how= How.CSS, using="#form_forgotpassword > fieldset > p > button > span")
    public static WebElement retrievepassword;


    public void click_backtologin() {
        backlogin.click();
    }

    public void set_myemail(String email) {
        myemail.sendKeys(email);
    }

    public void click_retrieve_password() {
        retrievepassword.click();
    }
}
