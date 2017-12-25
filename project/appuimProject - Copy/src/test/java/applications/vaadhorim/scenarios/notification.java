package applications.vaadhorim.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Created by Amit on 17/12/2017.
 */

    import applications.vaadhorim.pages.*;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


    public class notification extends AndroidSetup {

        //    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
//    private DatabaseReference myRef = firebaseDatabase.getReference();
//
        @BeforeClass
        public void setUp() throws Exception {
//        prepareAndroidForAppium();
            test();
        }


        public void test() throws Exception {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.2");
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "emulator-5554");
            caps.setCapability("autoDismissAlerts", true);
            driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @AfterClass
        public void tearDown() throws Exception {
            driver.quit();
        }

        @Test
        public void falseLoginTest() throws InterruptedException {
            // Create object of HashMap Class
//            Map<String, Object> prefs = new HashMap<String, Object>();
//
//            // Set the notification setting it will override the default setting
//            prefs.put("profile.default_content_setting_values.notifications", 2);
//
//            // Create object of ChromeOption class
//            ChromeOptions options = new ChromeOptions();
//
//            // Set the experimental option
//            options.setExperimentalOption("prefs", prefs);
//
//            // pass the options object in Chrome driver
//
//            WebDriver driver = new ChromeDriver(options);
//            driver.get("https://www.facebook.com/");
//            driver.manage().window().maximize();
//            driver.findElement(By.id("email")).sendKeys("urid");
//            driver.findElement(By.id("pass")).sendKeys("urpass");
//            driver.findElement(By.id("loginbutton")).click();
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--disable-notifications");
//            System.setProperty("webdriver.chrome.driver","path/to/driver/exe");
//            WebDriver driver =new ChromeDriver(options);
//
//
            String baseurl = "https://www.facebook.com";
            driver.get(baseurl);
//            driver.findElement(By.id("m_login_email")).sendKeys("cyber.infom1.il@gmail.com");
//            Thread.sleep(2000);
////
//            driver.findElement(By.name("pass")).sendKeys("Info.Media");
////            Thread.sleep(3500);
//            driver.findElement(By.name("login")).click();
////            Thread.sleep(10000);
////
////
//        /*
//        Log In With One Tap page
//            pass the login page
//            sometimes goes to different page that contain question - "do you want to log in with one tap...?"
//            if the page contains that question than - click ok
//            else: go on
//         */
////
//            String text = "Log In With One Tap";
//            List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
//            if(list.size() > 0){
//                driver.findElement(By.cssSelector("#root > div._4g33 > div > div > div._4g33._2pip > div:nth-child(2) > form > div > button")).click();
//            }
//
//            //       post text
//            Thread.sleep(5000);
////
////
//            driver.findElement(By.name("xc_message")).sendKeys("anyone knows me?");
////
////            Thread.sleep(1000);
////            driver.findElement(By.name("view_post")).click();
////            Thread.sleep(1000);
////
////
////
////            driver.findElement(By.cssSelector("._59te.jewel._hzb.noCount.popoverOpen ._59tf._2ftq")).click();
////            driver.findElement(By.cssSelector("#u_3_1 > div > div > div > div:nth-child(3) > div > div:nth-child(9) > a")).click();
////
////
////            Thread.sleep(10000);

        }

    }
