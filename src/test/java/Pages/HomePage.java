package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.CSS, using= "#block_top_menu > ul > li:nth-child(1) > a")
    public static WebElement women;

    @FindBy(how = How.XPATH, using= "//*[@id=\'block_top_menu\']/ul/li[2]/a")
    public static WebElement dresses;

    @FindBy(how = How.ID, using= "header_logo")
    public static WebElement logo;


     public void click_women_button(){

         women.click();
     }

    public void click_dresses_button() {

         dresses.click();
    }

    public void verify_logo() {

         logo.isDisplayed();
    }

    }





