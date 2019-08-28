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
        socialMediaPage=new SocialMediaPage(driver);
        socialMediaPage.followBySocialMedia(driver, "facebook", "Selenium Framework Public Group | Facebook");

    }

    @Test
    public void verifySocialBlockTwitter(){
        socialMediaPage=new SocialMediaPage(driver);
        socialMediaPage.followBySocialMedia(driver, "twitter", "Selenium Framework (@seleniumfrmwrk) | Twitter");

    }

    @Test
    public void verifySocialBlockYoutube(){
        socialMediaPage=new SocialMediaPage(driver);
        socialMediaPage.followBySocialMedia(driver, "youtube", "Selenium Framework - YouTube");

    }

    @Test
    public void verifySocialBlockGoogleplus(){
        socialMediaPage=new SocialMediaPage(driver);
        socialMediaPage.followBySocialMedia(driver, "google-plus", "Sign in - Google Accounts");

    }




    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }




}
