package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.logging.Logger;

public class ContactPage extends ScriptBase {

    public static final Logger log=Logger.getLogger(ContactPage.class.getName());

    @FindBy(css = "#contact-link > a")
    WebElement ContactUs;
    @FindBy(id = "id_contact")WebElement subjectHeadingSelect;
    @FindBy(xpath = "//*[@id='email']")WebElement emailInput;
    @FindBy(xpath = "//*[@id='id_order']")WebElement idOrder;
    @FindBy(xpath = "//*[@id='submitMessage']")WebElement submitSend;
    @FindBy(css = "#center_column > div > p")WebElement oneErrorMessage;



    public ContactPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void customerContact(String email, String reference, String value){
        ContactUs.click();
        log.info("Contact us Button clicked: "+ContactUs.toString());
        dropdown(subjectHeadingSelect,value);
        log.info("dropdown Subject Heading: "+value.toString());
        emailInput.sendKeys(email);
        log.info("Email input: "+email.toString());
        idOrder.sendKeys(reference);
        log.info("Order reference: "+reference.toString());
        submitSend.click();
        log.info("Click send Button to submit");
        Assert.assertEquals(oneErrorMessage,oneErrorMessage);
        log.info("One Error Message Found");

    }

    public void dropdown(WebElement element,String value){
        element=subjectHeadingSelect;
        Select select=new Select(element);
        select.selectByVisibleText(value);
    }




}





