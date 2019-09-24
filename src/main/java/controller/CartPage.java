package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.logging.Logger;

public class CartPage extends ScriptBase {

    public static final Logger log=Logger.getLogger(CartPage.class.getName());

    @FindBy(xpath = "//*[@id='header']//a[@title='View my shopping cart']")
    WebElement cartButton;
    @FindBy(xpath = "//*[@id='cart_title']")
    WebElement shoppingCartSummary;
    @FindBy(xpath = "//*[@id='center_column']/p")
    WebElement yourShoppingCartEmpty;
    @FindBy(xpath = "//*[@id='homefeatured']//h5/a[@title='Faded Short Sleeve T-shirts']")
    WebElement fadedShortSleeveTshirt;
    @FindBy(css = "#add_to_cart > button > span")
    WebElement addCartTab;
    @FindBy(xpath = "*//span[@title='Continue shopping']")
    WebElement continueShoppingTab;
    @FindBy(xpath = "//a[@title='View my shopping cart']")
    WebElement cartViewTab;
    @FindBy(xpath = "//*[@id='button_order_cart']/span[contains(text(),'Check out')]")
    WebElement cartCheckoutTab;
    @FindBy(xpath = "//*[@id='header_logo']/a/img[@alt='My Store']")
    WebElement homePageButton;
    @FindBy(xpath = "//*[@id='quantity_wanted_p']//i[@class='icon-plus']")
    WebElement cartQuantityPlus;
    @FindBy(xpath = "//*[@id='group_1']")
    WebElement sizeSelect;



    public CartPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void viewCart(WebDriver driver,String order_step){

        cartButton.click();
        log.info("Cart Button click:"+cartButton.toString());
        Assert.assertEquals(shoppingCartSummary,shoppingCartSummary);
        log.info("Shopping-Cart Summary ");
        cartBar(driver,order_step);
        log.info("Cart Bar Displayed:"+order_step.toString());
        Assert.assertEquals(yourShoppingCartEmpty,yourShoppingCartEmpty);
        log.info("Message found - Your shopping cart is empty.");

    }

    public void cartBar(WebDriver driver,String order_step){
        cartButton.click();
        driver.findElement(By.xpath("//*[@id='order_step']//span[contains(text(),'"+order_step+"')]")).isDisplayed();

    }

    public void mouseOver(WebElement element, WebDriver driver){
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

    }

    public void addCart(WebDriver driver) throws InterruptedException {

        homePageButton.click();
        log.info("Homepage Button clicked");

        mouseOver(fadedShortSleeveTshirt,driver);
        log.info("Mouse over Faded Short Sleeve T-shirts");

        fadedShortSleeveTshirt.click();
        log.info("Then click on Faded Short Sleeve T-shirts Button");

        addCartTab.click();
        Thread.sleep(5000);
        log.info("Then click Add to cart Button");

        continueShoppingTab.click();
        log.info("Then click Continue shopping Button");

        mouseOver(cartViewTab,driver);
        log.info("Then click Add to cart Button");

        cartCheckoutTab.isDisplayed();
        log.info("Checkout Button Displayed");

    }

    public void addCartWithMultipleQuantity(WebDriver driver,String addProduct,int quantity, String value, String color){

        homePageButton.click();
        log.info("Home Page Button Clicked:"+homePageButton.toString());

        addCartProduct(driver,addProduct);
        log.info("Product add cart done:"+addProduct.toString());

        productQuantity(cartQuantityPlus,quantity);
        log.info("Product quantity added: 10");

        dropdown(sizeSelect, value);
        log.info("Product size added by dropdown");

        addProductColor(driver, color);
        log.info("Product color added:"+color.toString());



    }

    public void addCartProduct(WebDriver driver, String addProduct){
        driver.findElement(By.xpath("//*[@id='homefeatured']/li//h5/a[@title='"+addProduct+"']")).click();
    }

    public void productQuantity(WebElement element,int quantity){
        for (int i=1; i<quantity; i++){
            element.click();
        }

    }

    public void dropdown(WebElement element, String value){
        element=sizeSelect;
        Select select=new Select(element);
        select.selectByVisibleText(value);
    }

    public void addProductColor(WebDriver driver, String color){
        driver.findElement(By.xpath("//*[@title='"+color+"']")).click();
    }

}
