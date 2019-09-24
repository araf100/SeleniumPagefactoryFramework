package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.logging.Logger;

public class SocialMediaPage extends ScriptBase {

    public static final Logger log=Logger.getLogger(SocialMediaPage.class.getName());

    public SocialMediaPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void followBySocialMedia(WebDriver driver, String block, String title){
        driver.findElement(By.xpath("//*[@class='"+block+"']")).click();
        log.info("Follow by social media: "+block.toString());
        windowhandle(driver, title);
        log.info("windowhandle : "+title.toString());
    }



    public void windowhandle(WebDriver driver, String title){

        String windowHandleBefore = driver.getWindowHandle();

        for (String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        String actualTitle = driver.getTitle();
        String expectedTitle = ""+title+"";
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();

        driver.switchTo().window(windowHandleBefore);


    }
}
