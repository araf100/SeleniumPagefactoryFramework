package contactPage;

import base.ScriptBase;
import controller.ContactPage;
import controller.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ContactPageTest extends ScriptBase {

    ContactPage contactPage;


    @Test
    public void verifyCustomerContact(){
        log.info("#######---verifyCustomerContact test start----######");
        contactPage=new ContactPage(driver);
        contactPage.customerContact("test@gmail.com","Ashraf Khan","Customer service");
        log.info("#######---verifyCustomerContact test ended----######");
    }

    @AfterTest
    public void closebrowser(){
        driver.quit();
    }
}

