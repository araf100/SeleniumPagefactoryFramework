package homePage;

import base.ScriptBase;
import controller.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class homePageTest extends ScriptBase {
    HomePage homePage;

    @BeforeTest
    public void beforetest() throws MalformedURLException {
        //init();
        //saucelab();
    }


    @Test
    public void homePageContactInfoVerify(){
        log.info("#######---homePageContactInfoVerify test start----######");
        homePage=new HomePage(driver);
        homePage.homePageContactInfo();
        log.info("#######---homePageContactInfoVerify test ended----######");
    }

    @Test
    public void SearchVerify(){
        log.info("#######---SearchVerify test start----######");
        homePage=new HomePage(driver);
        homePage.productSearch("Sleeve",driver,"4");
        log.info("#######---SearchVerify test ended----######");
    }

    @Test
    public void verifyHatSearch(){
        log.info("#######---verifyHatSearch test start----######");
        homePage=new HomePage(driver);
        homePage.productSearch("Hat",driver,"7");
        log.info("#######---verifyHatSearch test ended----######");
    }

    @Test
    public void verifyShoeSearch(){
        log.info("#######---verifyShoeSearch test start----######");
        homePage=new HomePage(driver);
        homePage.productSearchOne("Shoe",driver,"7");
        log.info("#######---verifyShoeSearch test ended----######");
    }

    @Test
    public void verifyDressSearch(){
        log.info("#######---verifyDressSearch test start----######");
        homePage=new HomePage(driver);
        homePage.productSearchTwo("Dress",driver,"7");
        log.info("#######---verifyDressSearch test ended----######");
    }

    @Test
    public void verifyBlouseSearch(){
        log.info("#######---verifyBlouseSearch test start----######");
        homePage=new HomePage(driver);
        homePage.productSearchThree("Blouse",driver,"1");
        log.info("#######---verifyBlouseSearch test ended----######");
    }

    @Test
    public void verifyWomenButton(){
        log.info("#######---verifyWomenButton test start----######");
        homePage=new HomePage(driver);
        homePage.categorySearch(driver,"Women");
        log.info("#######---verifyWomenButton test ended----######");
    }

    @Test
    public void verifyTshirtButton(){
        log.info("#######---verifyTshirtButton test start----######");
        homePage=new HomePage(driver);
        homePage.categorySearch(driver,"T-shirts");
        log.info("#######---verifyTshirtButton test ended----######");
    }

    @Test
    public void verifyPopularButton(){
        log.info("#######---verifyPopularButton test start----######");
        homePage=new HomePage(driver);
        homePage.featureSearch(driver,"Popular");
        log.info("#######---verifyPopularButton test ended----######");
    }

    @Test
    public void verifyBestSellersButton(){
        log.info("#######---verifyBestSellersButton test start----######");
        homePage=new HomePage(driver);
        homePage.featureSearch(driver,"Best Sellers");
        log.info("#######---verifyBestSellersButton test ended----######");
    }

    @Test
    public void verifySpecialsButton(){
        log.info("#######---verifySpecialsButton test start----######");
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"Specials");
        log.info("#######---verifySpecialsButton test ended----######");
    }

    @Test
    public void verifyNewProductsButton(){
        log.info("#######---verifyNewProductsButton test start----######");
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"New products");
        log.info("#######---verifyNewProductsButton test ended----######");
    }

    @Test
    public void verifyBestsellersButton(){
        log.info("#######---verifyBestsellersButton test start----######");
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"Best sellers");
        log.info("#######---verifyBestsellersButton test ended----######");
    }

    @Test
    public void verifyOurStoresButton(){
        log.info("#######---verifyOurStoresButton test start----######");
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"Our stores");
        log.info("#######---verifyOurStoresButton test ended----######");
    }

    @Test
    public void verifyContactUsButton(){
        log.info("#######---verifyContactUsButton test start----######");
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"Contact us");
        log.info("#######---verifyContactUsButton test ended----######");
    }

    @Test
    public void verifyAboutUsButton(){
        log.info("#######---verifyAboutUsButton test start----######");
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"About us");
        log.info("#######---verifyAboutUsButton test ended----######");
    }

    @Test
    public void verifySitemapButton(){
        log.info("#######---verifySitemapButton test start----######");
        homePage=new HomePage(driver);
        homePage.informationSearch(driver,"Sitemap");
        log.info("#######---verifySitemapButton test ended----######");
    }

    @Test
    public void verifyMyOrdersButton(){
        log.info("#######---verifyMyOrdersButton test start----######");
        homePage=new HomePage(driver);
        homePage.accountSearch(driver,"My orders");
        log.info("#######---verifyMyOrdersButton test ended----######");
    }

    @Test
    public void verifyMyCreditSlipsButton(){
        log.info("#######---verifyMyCreditSlipsButton test start----######");
        homePage=new HomePage(driver);
        homePage.accountSearch(driver,"My credit slips");
        log.info("#######---verifyMyCreditSlipsButton test ended----######");
    }

    @Test
    public void verifyMyAddressesButton(){
        log.info("#######---verifyMyAddressesButton test start----######");
        homePage=new HomePage(driver);
        homePage.accountSearch(driver,"My addresses");
        log.info("#######---verifyMyAddressesButton test ended----######");
    }

    @Test
    public void verifyMyPersonalinfoButton(){
        log.info("#######---verifyMyPersonalinfoButton test start----######");
        homePage=new HomePage(driver);
        homePage.accountSearch(driver,"Manage my personal information");
        log.info("#######---verifyMyPersonalinfoButton test ended----######");
    }

    @Test
    public void verifyCustomerService(){
        log.info("#######---verifyCustomerService test start----######");
        homePage=new HomePage(driver);
        homePage.customerService();
        log.info("#######---verifyCustomerService test ended----######");
    }

    @Test
    public void verifyFollowOnFacebook(){
        log.info("#######---verifyFollowOnFacebook test start----######");
        homePage=new HomePage(driver);
        homePage.followOnFacebook(driver);
        log.info("#######---verifyFollowOnFacebook test ended----######");
    }





    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }


}
