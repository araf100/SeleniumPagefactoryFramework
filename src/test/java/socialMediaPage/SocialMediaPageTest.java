package socialMediaPage;

import base.ScriptBase;
import controller.LoginPage;
import controller.SocialMediaPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SocialMediaPageTest extends ScriptBase {

    SocialMediaPage socialMediaPage;

    @BeforeTest
    public void beforetest(){
        init();

    }

    @Test
    public void verifySocialBlockFacebook(){
        log.info("#######---verifySocialBlockFacebook test start----######");
        socialMediaPage=new SocialMediaPage(driver);
        socialMediaPage.followBySocialMedia(driver, "facebook", "Selenium Framework Public Group | Facebook");
        log.info("#######---verifySocialBlockFacebook test ended----######");

    }

    @Test
    public void verifySocialBlockTwitter(){
        log.info("#######---verifySocialBlockTwitter test start----######");
        socialMediaPage=new SocialMediaPage(driver);
        socialMediaPage.followBySocialMedia(driver, "twitter", "Selenium Framework (@seleniumfrmwrk) | Twitter");
        log.info("#######---verifySocialBlockTwitter test ended----######");

    }

    @Test
    public void verifySocialBlockYoutube(){
        log.info("#######---verifySocialBlockYoutube test start----######");
        socialMediaPage=new SocialMediaPage(driver);
        socialMediaPage.followBySocialMedia(driver, "youtube", "Selenium Framework - YouTube");
        log.info("#######---verifySocialBlockYoutube test ended----######");

    }

    @Test
    public void verifySocialBlockGoogleplus(){
        log.info("#######---verifySocialBlockGoogleplus test start----######");
        socialMediaPage=new SocialMediaPage(driver);
        socialMediaPage.followBySocialMedia(driver, "google-plus", "Sign in - Google Accounts");
        log.info("#######---verifySocialBlockGoogleplus test ended----######");

    }




    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }




}
