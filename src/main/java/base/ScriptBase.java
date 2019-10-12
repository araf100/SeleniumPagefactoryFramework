package base;

import com.google.common.annotations.VisibleForTesting;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

   public class ScriptBase {
      public WebDriver driver;
      public static final Logger log=Logger.getLogger(ScriptBase.class.getName());
      public static final String USERNAME="ashrafqa";
      public static final String ACCESS_KEY="3c1460c4-08df-456c-9a8f-7b987bf90f25";
      public static final String URL="http://"+USERNAME+":"+ACCESS_KEY+"@ondemand.saucelabs.com:80/wd/hub";

      public void init(){
       String Log4jConfigPath="log4j.properties";
       PropertyConfigurator.configure(Log4jConfigPath);
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
       driver = new ChromeDriver();
       driver.get("http://automationpractice.com/index.php");

   }

   public void saucelab() throws MalformedURLException {
       DesiredCapabilities caps=new DesiredCapabilities();
       caps.setCapability("browserName","chrome");
       caps.setCapability("platform","macOS 10.13");
       caps.setCapability("version","latest");
       driver=new RemoteWebDriver(new URL(URL),caps);
       driver.get("http://automationpractice.com/index.php");

   }

   @Parameters("browser")
   @BeforeClass
   public void beforeTest(String browser) throws MalformedURLException {
       if (browser.equalsIgnoreCase("chrome")) {
           ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.addArguments("--kiosk");
           System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
           driver = new ChromeDriver(chromeOptions);
       }else if(browser.equalsIgnoreCase("sauceLabChrome")){
           DesiredCapabilities caps=new DesiredCapabilities();
           caps.setCapability("browserName","chrome");
           caps.setCapability("platform","macOS 10.13");
           caps.setCapability("version","latest");
           driver=new RemoteWebDriver(new URL(URL),caps);
       }else if(browser.equalsIgnoreCase("firefox")) {
           String Log4jConfigPath="log4j.properties";
           PropertyConfigurator.configure(Log4jConfigPath);
           System.setProperty("webdriver.firefox.driver","./drivers/geckodriver");
           driver = new FirefoxDriver();
       }else if(browser.equalsIgnoreCase("opera")) {
           String Log4jConfigPath="log4j.properties";
           PropertyConfigurator.configure(Log4jConfigPath);
           System.setProperty("webdriver.opera.driver","./drivers/chromedriver");
           driver = new OperaDriver();

       }
       driver.get("http://automationpractice.com/index.php");
   }

}
