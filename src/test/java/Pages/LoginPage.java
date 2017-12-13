package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.NAME, using= "email")
    public static WebElement myEmail;

    @FindBy(how = How.NAME, using= "passwd")
    public static WebElement myPassword;

    @FindBy(how = How.LINK_TEXT, using= "Forgot your password?")
    public static WebElement forgotpssw;

    @FindBy(how = How.NAME, using= "SubmitLogin")
    public static WebElement loginBtn;

    @FindBy(how = How.ID, using= "email_create")
    public static WebElement register_email;

    @FindBy(how = How.CSS, using= "#center_column > div.alert.alert-danger > ol > li")
    public static WebElement errormess;


    public void type_email (String email) {
        myEmail.sendKeys(email);
    }

    public void type_password (String password) {
        myPassword.sendKeys(password);
    }

    public void click_Login() {
        loginBtn.click();
    }

    public void click_forgot_password() {
        forgotpssw.click();
    }

    public void type_register_email( String regemail) {
        register_email.sendKeys(regemail);
    }

    public void verify_error ( ) {
       String message = errormess.getText();
       System.out.println(message);
    }
}


