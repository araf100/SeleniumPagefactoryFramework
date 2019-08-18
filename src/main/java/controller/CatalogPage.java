package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage extends ScriptBase {





    public CatalogPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void catalogDisplay(WebDriver driver, String catalog_tab){
        mouseOver(driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[contains(text(),'"+catalog_tab+"')]")),driver);
    }

    public void mouseOver(WebElement element, WebDriver driver){
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

    }

    public void womenCatagoryDisplay(WebDriver driver, String dress_catagory){
        mouseOver(driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[contains(text(),'Women')]")),driver);
        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/ul/li/ul/li/a[@title='"+dress_catagory+"']")).isDisplayed();

    }



}
