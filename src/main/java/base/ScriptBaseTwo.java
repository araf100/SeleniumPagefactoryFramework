package base;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScriptBaseTwo {

    public void BeforeTest(String endPageInfo){

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("//*[@id='footer']//a[@title='"+endPageInfo+"']")).isDisplayed();
        System.out.println("Specials button is Displayed");
    }

    public void init(WebDriver driver) {
        String Log4jConfigPath = "log4j.properties";
        PropertyConfigurator.configure(Log4jConfigPath);
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

    }



}
