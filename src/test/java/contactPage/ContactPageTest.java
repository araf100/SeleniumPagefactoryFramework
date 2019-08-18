package contactPage;

import base.ScriptBase;
import controller.ContactPage;
import controller.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactPageTest extends ScriptBase {

    ContactPage contactPage;

    @BeforeTest
    public void beforetest(){
        init();
    }

    @Test
    public void verifyCustomerContact(){
        contactPage=new ContactPage(driver);
        contactPage.customerContact("test@gmail.com","Ashraf Khan","Customer service");
    }
}

