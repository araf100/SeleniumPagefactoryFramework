package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactPage extends ScriptBase {

    @FindBy(css = "#contact-link > a")
    WebElement ContactUs;
    @FindBy(id = "id_contact")WebElement subjectHeadingSelect;
    @FindBy(xpath = "//*[@id='email']")WebElement emailInput;
    @FindBy(xpath = "//*[@id='id_order']")WebElement idOrder;
    @FindBy(xpath = "//*[@id='submitMessage']")WebElement submitSend;
    @FindBy(css = "#center_column > div > p")WebElement oneErrorMessage;
    @FindBy(xpath = "//*[@id='header']//a[@title='View my shopping cart']")WebElement cartButton;
    @FindBy(xpath = "//*[@id='cart_title']")WebElement shoppingCartSummary;
    @FindBy(xpath = "//*[@id='center_column']/p")WebElement yourShoppingCartEmpty;



    public ContactPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void customerContact(String email, String reference, String value){
        ContactUs.click();
        dropdown(subjectHeadingSelect,value);
        emailInput.sendKeys(email);
        idOrder.sendKeys(reference);
        submitSend.click();
        Assert.assertEquals(oneErrorMessage,oneErrorMessage);

    }

    public void dropdown(WebElement element,String value){
        element=subjectHeadingSelect;
        Select select=new Select(element);
        select.selectByVisibleText(value);
    }

    public void viewCart(WebDriver driver,String order_step){
        cartButton.click();
        Assert.assertEquals(shoppingCartSummary,shoppingCartSummary);
        driver.findElement(By.xpath("//*[@id='order_step']//span[contains(text(),'"+order_step+"')]")).isDisplayed();
        Assert.assertEquals(yourShoppingCartEmpty,yourShoppingCartEmpty);




    }



}





