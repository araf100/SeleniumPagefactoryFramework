package login;

import base.ScriptBase;
import controller.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest extends ScriptBase {
    LoginPage loginPage;

    @BeforeTest
    public void beforetest() throws MalformedURLException {
        //init();
        //saucelab();
    }


    @Test
    public void invalidLoginVerify(){
        log.info("#######---invalidLoginVerify test start----######");
        loginPage=new LoginPage(driver);
        loginPage.invalidSignin("test@gmail.com","abdc1234");
        log.info("#######---invalidLoginVerify test ended----######");

    }

    @Test
    public void validLoginVerify(){
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
        //driver.close();
        //driver.quit();
    }


}
