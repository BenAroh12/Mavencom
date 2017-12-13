package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {

    @FindBy(how = How.ID, using= "contact-link")
    public static WebElement contactus;

    @FindBy(how = How.LINK_TEXT, using= "Sign in")
    public static WebElement signin;


    public void click_sign_in() {
        signin.click();
    }
    public void click_contact_us() {
        contactus.click();


    }
}


