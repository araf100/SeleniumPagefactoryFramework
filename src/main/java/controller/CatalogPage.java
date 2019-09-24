package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class CatalogPage extends ScriptBase {

    public static final Logger log=Logger.getLogger(CatalogPage.class.getName());

    @FindBy(css ="#block_top_menu > ul > li:nth-child(1) > a") WebElement womenTab;
    @FindBy(css ="#categories_block_left > h2") WebElement womenFilterTab;

    public CatalogPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void catalogDisplay(WebDriver driver, String catalog_tab){
        mouseOver(driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[contains(text(),'"+catalog_tab+"')]")),driver);
        log.info("Mouse over: "+catalog_tab.toString());
    }

    public void mouseOver(WebElement element, WebDriver driver){
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

    }

    public void womenCatagoryDisplay(WebDriver driver, String dress_catagory){
        mouseOver(driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[contains(text(),'Women')]")),driver);
        log.info("Mouse over: Women Catagory Display ");
        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/ul/li/ul/li/a[@title='"+dress_catagory+"']")).isDisplayed();
        log.info("Dress Catagory Displayed: "+dress_catagory.toString());

    }


    public void womenCatalogeFilter(String filterCatagory,String dressCatagory,WebDriver driver){
        womenTab.click();
        if(womenFilterTab.isDisplayed()){
            driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li/a[contains(text(),'"+filterCatagory+"')]")).click();
            if (womenFilterTab.isDisplayed()){
                driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li/a[contains(text(),'"+dressCatagory+"')]")).isDisplayed();
            }else {
                System.out.println("Women Filter tab not found "+womenFilterTab);
            }

        }else {
            System.out.println("Women Filter Tab not found "+womenFilterTab);
        }

    }


}
