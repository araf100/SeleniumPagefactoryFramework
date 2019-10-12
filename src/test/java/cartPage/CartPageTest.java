package cartPage;

import base.ScriptBase;
import controller.CartPage;
import controller.ContactPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CartPageTest extends ScriptBase {

    CartPage cartPage;

    @BeforeTest
    public void beforetest() throws MalformedURLException {
        //init();
        //saucelab();
    }

    @Test
    public void verifyViewCart(){
        log.info("#######---verifyViewCart test start----######");
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Summary");
        log.info("#######---verifyViewCart test ended----######");

    }

    @Test
    public void verifyCartSummaryBar(){
        log.info("#######---verifyCartSummaryBar test start----######");
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Summary");
        log.info("#######---verifyCartSummaryBar test ended----######");

    }

    @Test
    public void verifyCartSigninBar(){
        log.info("#######---verifyCartSigninBar test start----######");
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Sign in");
        log.info("#######---verifyCartSigninBar test ended----######");

    }

    @Test
    public void verifyCartAddressBar(){
        log.info("#######---verifyCartAddressBar test start----######");
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Address");
        log.info("#######---verifyCartAddressBar test ended----######");

    }

    @Test
    public void verifyCartShippingBar(){
        log.info("#######---verifyCartShippingBar test start----######");
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Shipping");
        log.info("#######---verifyCartShippingBar test ended----######");

    }

    @Test
    public void verifyCartPaymentBar(){
        log.info("#######---verifyCartPaymentBar test start----######");
        cartPage=new CartPage(driver);
        cartPage.viewCart(driver,"Payment");
        log.info("#######---verifyCartPaymentBar test ended----######");

    }

    @Test
    public void verifyAddCart() throws InterruptedException{
        log.info("#######---verifyAddCart test start----######");
        cartPage=new CartPage(driver);
        cartPage.addCart(driver);
        log.info("#######---verifyAddCart test ended----######");

    }

    @Test
    public void verifyCartProductBlouseQuantity(){
        log.info("#######---verifyCartProductBlouseQuantity test start----######");
        cartPage=new CartPage(driver);
        cartPage.addCartWithMultipleQuantity(driver,"Blouse",10, "M", "Black");
        log.info("#######---verifyCartProductBlouseQuantity test ended----######");


    }

    @Test
    public void verifyCartProductChiffonDressQuantity(){
        log.info("#######---verifyCartProductChiffonDressQuantity test start----######");
        cartPage=new CartPage(driver);
        cartPage.addCartWithMultipleQuantity(driver,"Printed Chiffon Dress",3, "L", "Yellow");
        log.info("#######---verifyCartProductChiffonDressQuantity test ended----######");

    }

    @Test
    public void verifyremoveCartWithMultipleQuantity() throws InterruptedException {
        log.info("#######---verifyremoveCartWithMultipleQuantity test start----######");
        cartPage=new CartPage(driver);
        cartPage.removeCartWithMultipleQuantity(driver,"Blouse",10,"M","Black");
        log.info("#######---verifyremoveCartWithMultipleQuantity test ended----######");

    }




    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }


}




