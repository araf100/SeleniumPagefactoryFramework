package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends ScriptBase {

    @FindBy(xpath = "//*[@id='header']//a[@title='View my shopping cart']")
    WebElement cartButton;
    @FindBy(xpath = "//*[@id='cart_title']")WebElement shoppingCartSummary;
    @FindBy(xpath = "//*[@id='center_column']/p")WebElement yourShoppingCartEmpty;
    @FindBy(xpath = "//*[@id='homefeatured']//h5/a[@title='Faded Short Sleeve T-shirts']")WebElement fadedShortSleeveTshirt;
    @FindBy(css = "#add_to_cart > button > span")WebElement addCartTab;
    @FindBy(xpath = "*//span[@title='Continue shopping']")WebElement continueShoppingTab;
    @FindBy(xpath = "//a[@title='View my shopping cart']")WebElement cartViewTab;
    @FindBy(xpath = "//*[@id='button_order_cart']/span[contains(text(),'Check out')]")WebElement cartCheckoutTab;



    public CartPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void viewCart(WebDriver driver,String order_step){
        cartButton.click();
        Assert.assertEquals(shoppingCartSummary,shoppingCartSummary);
        cartBar(driver,order_step);
        Assert.assertEquals(yourShoppingCartEmpty,yourShoppingCartEmpty);

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
        mouseOver(fadedShortSleeveTshirt,driver);
        fadedShortSleeveTshirt.click();
        addCartTab.click();
        Thread.sleep(5000);
        continueShoppingTab.click();
        mouseOver(cartViewTab,driver);
        cartCheckoutTab.isDisplayed();

    }




}
