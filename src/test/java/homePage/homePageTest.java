package homePage;

import base.ScriptBase;
import controller.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homePageTest extends ScriptBase {
    HomePage homePage;

    @BeforeTest
    public void beforetest(){
        init();

    }

    @Test
    public void homePageContactInfoVerify(){
        homePage=new HomePage(driver);
        homePage.homePageContactInfo();
    }

    @Test
    public void SearchVerify(){
        homePage=new HomePage(driver);
        homePage.productSearch("Sleeve",driver,"4");
    }

    @Test
    public void verifyHatSearch(){
        homePage=new HomePage(driver);
        homePage.productSearch("Hat",driver,"7");
    }



    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }


}
