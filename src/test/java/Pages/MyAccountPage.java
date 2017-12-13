package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage {

    @FindBy(how= How.CSS, using="#header > div.nav > div > div > nav > div:nth-child(1) > a > span")
    public static WebElement accountuser;

    @FindBy(how= How.CSS, using="#header > div.nav > div > div > nav > div:nth-child(2) > a")
    public static WebElement signoutuser;

    public void verify_account_user () {
        Assert.assertEquals("Ben Aroh", accountuser.getText());
        System.out.println(accountuser.getText());
    }

    public void click_sighout_user () {
        signoutuser.click();

    }
}
