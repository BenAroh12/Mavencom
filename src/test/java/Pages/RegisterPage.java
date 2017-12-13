package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {

    @FindBy(how = How.XPATH, using= "//*[@id=\'email_create\']")
    public static WebElement myemailaccount;

    @FindBy(how = How.CSS, using= "#SubmitCreate > span")
    public static WebElement createaccount;

    @FindBy(how = How.CSS, using= "#account-creation_form > div:nth-child(1) > h3")
    public static WebElement personalinfo;

    @FindBy(how = How.ID, using= "id_gender1")
    public static WebElement mytitle;

    @FindBy(how = How.ID, using= "customer_firstname")
    public static WebElement myfirstname;

    @FindBy(how = How.ID, using= "customer_lastname")
    public static WebElement mylastname;

    @FindBy(how = How.ID, using= "email")
    public static WebElement emaildisplayed;

    @FindBy(how = How.ID, using= "passwd")
    public static WebElement accountpassword;

    @FindBy(how = How.ID, using= "days")
    public static WebElement dobday;

    @FindBy(how = How.ID, using= "months")
    public static WebElement dobmonth;

    @FindBy(how = How.ID, using= "years")
    public static WebElement dobyear;

    @FindBy(how = How.ID, using= "newsletter")
    public static WebElement newslettersignup;

    @FindBy(how = How.ID, using= "optin")
    public static WebElement receiveoffer;

    @FindBy(how = How.CSS, using= "#account-creation_form > div:nth-child(2) > h3")
    public static WebElement youraddress;

    @FindBy(how = How.ID, using= "firstname")
    public static WebElement addfirstname;

    @FindBy(how = How.ID, using= "lastname")
    public static WebElement addlastname;

    @FindBy(how = How.ID, using= "company")
    public static WebElement mycompany;

    @FindBy(how = How.ID, using= "address1")
    public static WebElement addresscompany;

    @FindBy(how = How.ID, using= "city")
    public static WebElement mycity;

    @FindBy(how = How.ID, using= "id_state")
    public static WebElement mystate;

    @FindBy(how = How.ID, using= "postcode")
    public static WebElement mypostcode;

    @FindBy(how = How.ID, using= "id_country")
    public static WebElement mycountry;

    @FindBy(how = How.ID, using= "other")
    public static WebElement additionalinfo;

    @FindBy(how = How.ID, using= "phone")
    public static WebElement phonenum;

    @FindBy(how = How.ID, using= "alias")
    public static WebElement myalias;

    @FindBy(how = How.ID, using= "submitAccount")
    public static WebElement regccount;

    @FindBy(how = How.CSS, using= "#header > div.nav > div > div > nav > div:nth-child(1) > a > span")
    public static WebElement accountname;

    @FindBy(how = How.CSS, using= "#header > div.nav > div > div > nav > div:nth-child(2) > a")
    public static WebElement accountsignout;


    public void type_email_address() {
       myemailaccount.sendKeys("lotamusomebi@gmail.com");
    }




}


