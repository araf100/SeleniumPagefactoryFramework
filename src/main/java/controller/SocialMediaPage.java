package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SocialMediaPage extends ScriptBase {



    public SocialMediaPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void followBySocialMedia(WebDriver driver, String block, String title){
        driver.findElement(By.xpath("//*[@class='"+block+"']")).click();
        windowhandle(driver, title);
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
