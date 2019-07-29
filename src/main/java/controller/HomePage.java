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

    public void productSearchOne(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();

    }

    public void productSearchTwo(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();

    }

    public void productSearchThree(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" result has been found.')]")).isDisplayed();

    }

    public void categorySearch(WebDriver driver,String categorySelect){
        driver.findElement(By.xpath("//*[@id='block_top_menu']//li[1]/a[@title='"+categorySelect+"']")).isDisplayed();

    }

    public void featureSearch(WebDriver driver,String categorySelect){
        driver.findElement(By.xpath("//*[@id='home-page-tabs']//a[@class='"+categorySelect+"']")).isDisplayed();

    }

    public void informationSearch(WebDriver driver,String categorySelect){
        driver.findElement(By.xpath("//*[@id='block_various_links_footer']//a[@title='"+categorySelect+"']")).isDisplayed();

    }

    public void accountSearch(WebDriver driver,String categorySelect){
        driver.findElement(By.xpath("//*[@id='footer']//a[@title='"+categorySelect+"']")).isDisplayed();

    }


}
