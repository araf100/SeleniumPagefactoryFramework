package cartPage;

import base.ScriptBase;
import controller.CartPage;
import controller.ContactPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartPageTest extends ScriptBase {

    CartPage cartPage;

    @BeforeTest
    public void beforetest(){
        init();
    }

    @Test
    public void verifyViewCart(){
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Summary");

    }

    @Test
    public void verifyCartSummaryBar(){
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Summary");

    }

    @Test
    public void verifyCartSigninBar(){
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Sign in");

    }

    @Test
    public void verifyCartAddressBar(){
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Address");

    }

    @Test
    public void verifyCartShippingBar(){
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Shipping");

    }

    @Test
    public void verifyCartPaymentBar(){
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Payment");

    }




    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }


}




