package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class LoginPage extends ScriptBase {

    public static final Logger log=Logger.getLogger(LoginPage.class.getName());

    @FindBy(xpath ="//a[@class='login']")
    WebElement signinButton;
    @FindBy(id = "email")
    WebElement emailSendKey;
    @FindBy(id = "passwd")
    WebElement passwordSendKey;
    @FindBy(css = "#SubmitLogin > span")
    WebElement submitButton;
    @FindBy(linkText = "Zaman Dewan")
    WebElement signInSuccessful;
    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")
    WebElement signInMessageFailed;
    @FindBy(xpath = "//*[@id='header']//a[@title='Log me out']")
    WebElement signOut;
    @FindBy(id = "email_create")
    WebElement emailCreateInput;
    @FindBy(css = "#SubmitCreate > span")
    WebElement submitCreateAccountButton;
    @FindBy(xpath= "//*[@id='create_account_error']")
    WebElement inValidEmailErrorMessage;
    @FindBy(css= "#id_gender1")
    WebElement titleMrButton;
    @FindBy(id= "customer_firstname")
    WebElement firstNameSendKey;
    @FindBy(id= "customer_lastname")
    WebElement lastNameSendKey;
    @FindBy(id = "email")
    WebElement signupEmail;
    @FindBy(id = "passwd")
    WebElement signupPassword;
    @FindBy(css = "#submitAccount > span")
    WebElement submitRegisterButton;
    @FindBy(xpath = "//*[@id='center_column']/div")
    WebElement invalidSignpErrorMessage;









    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void invalidSignin(String email, String password){
        signinButton.click();
        log.info("Signin Button clicked: "+signinButton.toString());
        emailSendKey.sendKeys(email);
        log.info("E-mail sendkey: "+email.toString());
        passwordSendKey.sendKeys(password);
        log.info("Password sendkey: "+password.toString());
        submitButton.click();
        log.info("Submit Button clicked: "+submitButton.toString());
        Assert.assertEquals(signInMessageFailed,signInMessageFailed);
        log.info("Message found: "+signInMessageFailed.toString());


    }

    public void validSignin(String email, String password){
        signinButton.click();
        log.info("Signin Button clicked: "+signinButton.toString());
        emailSendKey.sendKeys(email);
        log.info("E-mail sendkey: "+email.toString());
        passwordSendKey.sendKeys(password);
        log.info("Password sendkey: "+password.toString());
        submitButton.click();
        log.info("Submit Button clicked: "+submitButton.toString());
        Assert.assertEquals(signInSuccessful,signInSuccessful);
        log.info("Message found: "+signInSuccessful.toString());

    }

    public void validSigninWithLogOut(){
        signOut.click();
        log.info("Signout clicked: "+signOut.toString());
    }

    public void invalidCreateAccount(String email){
        signinButton.click();
        log.info("Signin Button clicked: "+signinButton.toString());
        emailCreateInput.sendKeys(email);
        log.info("E-mail create input sendkey: "+emailCreateInput.toString());
        submitCreateAccountButton.click();
        log.info("Submit create account Button: "+submitCreateAccountButton.toString());
        Assert.assertEquals(inValidEmailErrorMessage,inValidEmailErrorMessage);
        log.info("Message found: "+inValidEmailErrorMessage.toString());

    }


    public void invalidSignup(String email, WebDriver driver, String firstname, String lastname, String signupemail, String signuppassword){
        signinButton.click();
        log.info("Signin Button clicked: "+signinButton.toString());
        emailCreateInput.sendKeys(email);
        log.info("E-mail create input sendkey: "+emailCreateInput.toString());
        submitCreateAccountButton.click();
        log.info("Submit create account Button: "+submitCreateAccountButton.toString());
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        log.info("timeouts.implicitlyWait: 30 seconds");
        titleMrButton.click();
        log.info("Title Mr Button clicked: "+titleMrButton.toString());
        firstNameSendKey.sendKeys(firstname);
        log.info("First Name sendkey: "+firstname.toString());
        lastNameSendKey.sendKeys(lastname);
        log.info("Last Name sendkey: "+lastname.toString());
        signupEmail.sendKeys(signupemail);
        log.info("Sign up email sendkey: "+signupemail.toString());
        signupPassword.sendKeys(signuppassword);
        log.info("Sign up password sendkey: "+signuppassword.toString());
        submitRegisterButton.click();
        log.info("Click register Button to submit: "+submitRegisterButton.toString());
        Assert.assertEquals(invalidSignpErrorMessage,invalidSignpErrorMessage);
        log.info("Message found: "+invalidSignpErrorMessage.toString());


        //email: test420@gmail.com
        //password: admin1234

    }
}

