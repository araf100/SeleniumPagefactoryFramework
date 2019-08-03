package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
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
    @FindBy(css = "#center_column > h1")WebElement customerService;
    @FindBy(xpath ="//a[@class='login']") WebElement SignIn;
    @FindBy(id= "search_query_top")WebElement SearchSendKey;
    @FindBy(css = "#searchbox > button")WebElement searchButton;
    @FindBy(css = "#header_logo > a > img")WebElement homepageNavigation;





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
        SearchSendKey.clear();

    }

    public void productSearchOne(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();
        SearchSendKey.clear();


    }

    public void productSearchTwo(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();
        SearchSendKey.clear();

    }

    public void productSearchThree(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        searchButton.click();
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" result has been found.')]")).isDisplayed();
        SearchSendKey.clear();

    }

    public void categorySearch(WebDriver driver,String categorySelect){
        driver.findElement(By.xpath("//*[@id='block_top_menu']//li[1]/a[@title='"+categorySelect+"']")).isDisplayed();

    }

    public void featureSearch(WebDriver driver,String categorySelect){
        homepageNavigation.click();
        driver.findElement(By.xpath("//*[@id='home-page-tabs']//a[contains(text(),'"+categorySelect+"')]")).isDisplayed();

    }

    public void informationSearch(WebDriver driver,String categorySelect){
        driver.findElement(By.xpath("//*[@id='block_various_links_footer']//a[@title='"+categorySelect+"']")).isDisplayed();

    }

    public void accountSearch(WebDriver driver,String categorySelect){
        driver.findElement(By.xpath("//*[@id='footer']//a[@title='"+categorySelect+"']")).isDisplayed();

    }

    public void customerService(){
       ContactUs.click();
       Assert.assertEquals(customerService,customerService);

    }


}
