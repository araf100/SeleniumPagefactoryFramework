package catalogPage;

import base.ScriptBase;
import controller.CatalogPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CatalogPageTest extends ScriptBase {

    CatalogPage catalogPage;


    @BeforeTest
    public void beforetest(){
        init();
    }

    @Test
    public void verifyCatalogWomenDisplay(){
        catalogPage=new CatalogPage(driver);
        catalogPage.catalogDisplay(driver, "Women");

    }

    @Test
    public void verifyCatalogDressDisplay(){
        catalogPage=new CatalogPage(driver);
        catalogPage.catalogDisplay(driver, "Dresses");

    }

    @Test
    public void verifyCatalogTshirtDisplay(){
        catalogPage=new CatalogPage(driver);
        catalogPage.catalogDisplay(driver, "T-shirts");

    }

    @Test
    public void verifyWomenTshirtsDisplay(){
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatagoryDisplay(driver, "T-shirts");

    }

    @Test
    public void verifyWomenBlousesDisplay(){
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatagoryDisplay(driver, "Blouses");

    }

    @Test
    public void verifyWomenCasualDressesDisplay(){
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatagoryDisplay(driver, "Casual Dresses");

    }

    @Test
    public void verifyWomenEveningDressesDisplay(){
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatagoryDisplay(driver, "Evening Dresses");

    }

    @Test
    public void verifyWomenSummerDressesDisplay(){
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatagoryDisplay(driver, "Summer Dresses");

    }






    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }


}
