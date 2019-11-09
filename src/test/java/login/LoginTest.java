package login;

import base.ScriptBase;
import controller.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import reporting.ExtentsReports.ExtentTestManager;

import java.net.MalformedURLException;

public class LoginTest extends ScriptBase {
    LoginPage loginPage;



    @Test (alwaysRun = true,priority = 1,description = "Verify Invalid Login Test")
    public void verifyInvalidLogin(){
        ExtentTestManager.startTest("verifyInvalidLogin","Invalid Login Scenario with empty username and password");
        log.info("#######---invalidLoginVerify test start----######");
        loginPage=new LoginPage(driver);
        loginPage.invalidSignin("test@gmail.com","abdc1234");
        log.info("#######---invalidLoginVerify test ended----######");

    }

    @Test
    public void verifyValidLogin(){
        log.info("#######---validLoginVerify test start----######");
        loginPage=new LoginPage(driver);
        loginPage.validSignin("futureitgroup@gmail.com","admin123");
        log.info("#######---validLoginVerify test ended----######");
    }

    @Test
    public void validLoginWithLogOutVerify(){
        log.info("#######---validLoginWithLogOutVerify test start----######");
        loginPage=new LoginPage(driver);
        loginPage.validSigninWithLogOut();
        log.info("#######---validLoginWithLogOutVerify test ended----######");
    }

    @Test
    public void invalidCreateAccountVerify(){
        log.info("#######---invalidCreateAccountVerify test start----######");
        loginPage=new LoginPage(driver);
        loginPage.invalidCreateAccount("abcd");
        log.info("#######---invalidCreateAccountVerify test ended----######");
    }

    @Test
    public void invalidSignUpAccountVerify(){
        log.info("#######---invalidSignUpAccountVerify test start----######");
        loginPage=new LoginPage(driver);
        loginPage.invalidSignup("test420@gmail.com",driver,"Ashraf","Khan","test420@gmail.com","admin1234");
        log.info("#######---invalidSignUpAccountVerify test ended----######");
    }

    @AfterTest
    public void closebrowser(){
        driver.quit();
    }


}
