package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends ScriptBase {

    @FindBy(css= "#header > div.nav > div > div > nav > span")
    WebElement CallUs;
    @FindBy(css = "#header > div.nav > div > div > nav > span > strong")WebElement PhoneNumber;
    @FindBy(css = "#contact-link > a")WebElement ContactUs;
    @FindBy(xpath ="//a[@class='login']") WebElement SignIn;
    @FindBy(id= "search_query_top")WebElement SearchSendKey;
    @FindBy(css = "#searchbox > button")WebElement searchButton;



    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void homePageContactInfo(){
        CallUs.isDisplayed();
        PhoneNumber.isDisplayed();
        ContactUs.isDisplayed();
        SignIn.click();
    }


    public void productSearch(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();

    }


}
