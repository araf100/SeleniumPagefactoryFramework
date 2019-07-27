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

    @Test
    public void verifyShoeSearch(){
        homePage=new HomePage(driver);
        homePage.productSearchOne("Shoe",driver,"7");
    }

    @Test
    public void verifyDressSearch(){
        homePage=new HomePage(driver);
        homePage.productSearchTwo("Dress",driver,"7");
    }

    @Test
    public void verifyBlouseSearch(){
        homePage=new HomePage(driver);
        homePage.productSearchThree("Blouse",driver,"1");
    }

    @Test
    public void verifyWomenButton(){
        homePage=new HomePage(driver);
        homePage.categorySearch(driver,"Women");
    }

    @Test
    public void verifyTshirtButton(){
        homePage=new HomePage(driver);
        homePage.categorySearch(driver,"T-shirts");
    }



    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }


}
