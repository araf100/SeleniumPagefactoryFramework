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
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

   public class ScriptBase {
      public static WebDriver driver;
      public static final Logger log=Logger.getLogger(ScriptBase.class.getName());
      public static final String USERNAME="ashrafqa";
      public static final String ACCESS_KEY="3c1460c4-08df-456c-9a8f-7b987bf90f25";
      public static final String URL="http://"+USERNAME+":"+ACCESS_KEY+"@ondemand.saucelabs.com:80/wd/hub";



       @Parameters("browser")
       @BeforeClass
       public void beforetest(String browser) throws MalformedURLException {
           if (browser.equalsIgnoreCase("chrome")) {
               System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
               driver=new ChromeDriver();
           }else if (browser.equalsIgnoreCase("firefox")){
               System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/drivers/geckodriver");
               driver=new FirefoxDriver();
           }else if (browser.equalsIgnoreCase("safari")){
               System.setProperty("webdriver.safari.noinstall","true");
               driver=new SafariDriver();
           }else if (browser.equalsIgnoreCase("sauceLab")){
               DesiredCapabilities caps=new DesiredCapabilities();
               caps.setCapability("browserName","chrome");
               caps.setCapability("platform","macOS 10.13");
               caps.setCapability("version","latest");
               driver=new RemoteWebDriver(new URL(URL),caps);
           }
           driver.get("http://automationpractice.com/index.php");

       }
   }

