package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends ScriptBase {

    @FindBy(xpath = "//*[@id='header']//a[@title='View my shopping cart']")
    WebElement cartButton;
    @FindBy(xpath = "//*[@id='cart_title']")WebElement shoppingCartSummary;
    @FindBy(xpath = "//*[@id='center_column']/p")WebElement yourShoppingCartEmpty;



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




}
