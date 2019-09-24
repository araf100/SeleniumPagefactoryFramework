package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.logging.Logger;

public class HomePage extends ScriptBase {

    public static final Logger log=Logger.getLogger(HomePage.class.getName());

    @FindBy(css= "#header > div.nav > div > div > nav > span")
    WebElement CallUs;
    @FindBy(css = "#header > div.nav > div > div > nav > span > strong")
    WebElement PhoneNumber;
    @FindBy(css = "#contact-link > a")
    WebElement ContactUs;
    @FindBy(css = "#center_column > h1")
    WebElement customerService;
    @FindBy(xpath ="//a[@class='login']")
    WebElement SignIn;
    @FindBy(id= "search_query_top")
    WebElement SearchSendKey;
    @FindBy(css = "#searchbox > button")
    WebElement searchButton;
    @FindBy(css = "#header_logo > a > img")
    WebElement homepageNavigation;
    @FindBy(xpath = "//*[@id='facebook_block']/div")
    WebElement followOnFacebook;
    @FindBy(xpath = "//*[@id='facebook_block']/div/div/span/iframe")
    WebElement followOnFacebookIframe;




    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void homePageContactInfo(){
        CallUs.isDisplayed();
        log.info("Call us now: displayed");
        PhoneNumber.isDisplayed();
        log.info("Phone no: 0123-456-789 displayed");
        ContactUs.isDisplayed();
        log.info("Contact us Button displayed");
        SignIn.click();
        log.info("Sign in Button clicked");
    }


    public void productSearch(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        log.info("Search SendKeys: "+productName.toString());
        searchButton.click();
        log.info("Then Search Button clicked");
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();
        log.info("results have been found: "+quantity.toString());
        SearchSendKey.clear();
        log.info("Search SendKey clear");

    }

    public void productSearchOne(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        log.info("Search SendKeys: "+productName.toString());
        searchButton.click();
        log.info("Then Search Button clicked");
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();
        log.info("results have been found: "+quantity.toString());
        SearchSendKey.clear();
        log.info("Search SendKey clear");


    }

    public void productSearchTwo(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        log.info("Search SendKeys: "+productName.toString());
        searchButton.click();
        log.info("Then Search Button clicked");
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" results have been found.')]")).isDisplayed();
        log.info("results have been found: "+quantity.toString());
        SearchSendKey.clear();
        log.info("Search SendKey clear");

    }

    public void productSearchThree(String productName,WebDriver driver,String quantity){
        SearchSendKey.sendKeys(productName);
        log.info("Search SendKeys: "+productName.toString());
        searchButton.click();
        log.info("Then Search Button clicked");
        driver.findElement(By.xpath("//*[@id='center_column']//span[contains(text(),'"+quantity+" result has been found.')]")).isDisplayed();
        log.info("results have been found: "+quantity.toString());
        SearchSendKey.clear();
        log.info("Search SendKey clear");

    }

    public void categorySearch(WebDriver driver,String categorySelect){
        driver.findElement(By.xpath("//*[@id='block_top_menu']//li[1]/a[@title='"+categorySelect+"']")).isDisplayed();
        log.info("Category search: "+categorySelect.toString());

    }

    public void featureSearch(WebDriver driver,String categorySelect){
        homepageNavigation.click();
        log.info("Homepage Navigation: "+homepageNavigation.toString());
        driver.findElement(By.xpath("//*[@id='home-page-tabs']//a[contains(text(),'"+categorySelect+"')]")).isDisplayed();
        log.info("Category displayed: "+categorySelect.toString());

    }

    public void informationSearch(WebDriver driver,String categorySelect){
        driver.findElement(By.xpath("//*[@id='block_various_links_footer']//a[@title='"+categorySelect+"']")).isDisplayed();
        log.info("Information search: "+categorySelect.toString());

    }

    public void accountSearch(WebDriver driver,String categorySelect){
        driver.findElement(By.xpath("//*[@id='footer']//a[@title='"+categorySelect+"']")).isDisplayed();
        log.info("Account search: "+categorySelect.toString());

    }

    public void customerService(){
        ContactUs.click();
        log.info("Contact us Button clicked: "+ContactUs.toString());
        Assert.assertEquals(customerService,customerService);
        log.info("Customer Service-Contact us page-heading found");

    }

    public void followOnFacebook(WebDriver driver){
        homepageNavigation.click();
        log.info("Homepage clicked: "+homepageNavigation.toString());
        driver.switchTo().frame(0);
        log.info("I am inside iframe ");
        driver.switchTo().defaultContent();
        log.info("I am Outside iframe ");
        followOnFacebook.isDisplayed();
        log.info("Follow us on Facebook is displayed");

    }


}
