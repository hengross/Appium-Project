package applications.vaadhorim.scenarios;

/**
 * Created by izakos on 29/11/2016.
 */

import applications.vaadhorim.pages.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class picTest extends AndroidSetup {

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
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void falseLoginTest() throws InterruptedException {
        String baseurl = "https://www.facebook.com";
        driver.get(baseurl);
        driver.findElement(By.id("m_login_email")).sendKeys("cyber.infom1.il@gmail.com");
        Thread.sleep(8000);
        driver.findElement(By.name("pass")).sendKeys("Info.Media");
        Thread.sleep(3500);
        driver.findElement(By.name("login")).click();
        Thread.sleep(10000);

        // pass the login page
        //sometimes goes to different page that contain question - "are you...?"
        // if the page contains that question than - click ok
        //else: go on

        String text = "Log In With One Tap";
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
        if(list.size() > 0){
            driver.findElement(By.cssSelector("#root > div._4g33 > div > div > div._4g33._2pip > div:nth-child(2) > form > div > button")).click();
        }

//       post picture
        Thread.sleep(5000);
//        driver.findElement(By.name("xc_message")).sendKeys("C:\\Users\\Amit\\Desktop\\סיור ירושלים.jpeg");
//        Thread.sleep(1000);
        driver.findElement(By.name("view_photo")).click();
        driver.findElement(By.name("file1")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(text(),'" + "Files" + "')]")).click();
        driver.findElement(By.name("add_photo_done")).click();
        driver.findElement(By.xpath("//*[contains(text(),'" + "Post" + "')]")).click();
//        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.view.view[1][@clickable='True']")).click();
        driver.findElement(By.name("view_post")).click();

        Thread.sleep(10000);

    }


}