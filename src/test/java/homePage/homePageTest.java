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

    @Test
    public void verifyPopularButton(){
        homePage=new HomePage(driver);
        homePage.featureSearch(driver,"homefeatured");
    }

    @Test
    public void verifyBestSellersButton(){
        homePage=new HomePage(driver);
        homePage.featureSearch(driver,"blockbestsellers");
    }

    @Test
    public void verifySpecialsButton(){
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"Specials");
    }

    @Test
    public void verifyNewProductsButton(){
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"New products");
    }

    @Test
    public void verifyBestsellersButton(){
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"Best sellers");
    }

    @Test
    public void verifyOurStoresButton(){
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"Our stores");
    }

    @Test
    public void verifyContactUsButton(){
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"Contact us");
    }

    @Test
    public void verifyAboutUsButton(){
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"About us");
    }

    @Test
    public void verifySitemapButton(){
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"Sitemap");
    }

    @Test
    public void verifyMyOrdersButton(){
        homePage=new HomePage(driver);
        homePage.accountSearch(driver,"My orders");
    }

    @Test
    public void verifyMyCreditSlipsButton(){
        homePage=new HomePage(driver);
        homePage.accountSearch(driver,"My credit slips");
    }

    @Test
    public void verifyMyAddressesButton(){
        homePage=new HomePage(driver);
        homePage.accountSearch(driver,"My addresses");
    }

    @Test
    public void verifyMyPersonalinfoButton(){
        homePage=new HomePage(driver);
        homePage.accountSearch(driver,"Manage my personal information");
    }



    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }


}
