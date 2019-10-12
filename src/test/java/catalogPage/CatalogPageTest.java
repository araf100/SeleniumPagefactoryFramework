package catalogPage;

import base.ScriptBase;
import controller.CatalogPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CatalogPageTest extends ScriptBase {

    CatalogPage catalogPage;


    @BeforeTest
    public void beforetest() throws MalformedURLException {
        //init();
        //saucelab();
    }

    @Test
    public void verifyCatalogWomenDisplay(){
        log.info("#######---verifyCatalogWomenDisplay test start----######");
        catalogPage=new CatalogPage(driver);
        catalogPage.catalogDisplay(driver, "Women");
        log.info("#######---verifyCatalogWomenDisplay test ended----######");

    }

    @Test
    public void verifyCatalogDressDisplay(){
        log.info("#######---verifyCatalogDressDisplay test start----######");
        catalogPage=new CatalogPage(driver);
        catalogPage.catalogDisplay(driver, "Dresses");
        log.info("#######---verifyCatalogDressDisplay test ended----######");

    }

    @Test
    public void verifyCatalogTshirtDisplay(){
        log.info("#######---verifyCatalogTshirtDisplay test start----######");
        catalogPage=new CatalogPage(driver);
        catalogPage.catalogDisplay(driver, "T-shirts");
        log.info("#######---verifyCatalogTshirtDisplay test ended----######");

    }

    @Test
    public void verifyWomenTshirtsDisplay(){
        log.info("#######---verifyWomenTshirtsDisplay test start----######");
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatagoryDisplay(driver, "T-shirts");
        log.info("#######---verifyWomenTshirtsDisplay test ended----######");

    }

    @Test
    public void verifyWomenBlousesDisplay(){
        log.info("#######---verifyWomenBlousesDisplay test start----######");
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatagoryDisplay(driver, "Blouses");
        log.info("#######---verifyWomenBlousesDisplay test ended----######");

    }

    @Test
    public void verifyWomenCasualDressesDisplay(){
        log.info("#######---verifyWomenCasualDressesDisplay test start----######");
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatagoryDisplay(driver, "Casual Dresses");
        log.info("#######---verifyWomenCasualDressesDisplay test start----######");

    }

    @Test
    public void verifyWomenEveningDressesDisplay(){
        log.info("#######---verifyWomenEveningDressesDisplay test start----######");
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatagoryDisplay(driver, "Evening Dresses");
        log.info("#######---verifyWomenEveningDressesDisplay test ended----######");

    }

    @Test
    public void verifyWomenSummerDressesDisplay(){
        log.info("#######---verifyWomenSummerDressesDisplay test start----######");
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatagoryDisplay(driver, "Summer Dresses");
        log.info("#######---verifyWomenSummerDressesDisplay test ended----######");

    }

    @Test
    public void verifyWomenFilerProduct(){
        log.info("#######---verifyWomenFilerProduct test start----######");
        catalogPage=new CatalogPage(driver);
        catalogPage.womenCatalogeFilter("Tops","T-shirts",driver);
        log.info("#######---verifyWomenFilerProduct test ended----######");

    }




    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }


}
