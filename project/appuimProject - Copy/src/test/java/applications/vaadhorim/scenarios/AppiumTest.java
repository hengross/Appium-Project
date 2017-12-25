package applications.vaadhorim.scenarios;

/**
 * Created by izakos on 29/11/2016.
 */

import applications.vaadhorim.pages.*;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class AppiumTest extends AndroidSetup {

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
        String baseurl = "https://www.facebook.com";
        driver.get(baseurl);
        driver.findElement(By.id("m_login_email")).sendKeys("cyber.infom1.il@gmail.com");
        Thread.sleep(3000);

        driver.findElement(By.name("pass")).sendKeys("Info.Media");
        Thread.sleep(3500);
        driver.findElement(By.name("login")).click();
        Thread.sleep(10000);


        /*
        Log In With One Tap page
            pass the login page
            sometimes goes to different page that contain question - "do you want to log in with one tap...?"
            if the page contains that question than - click ok
            else: go on
         */

        String text = "Log In With One Tap";
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
        if(list.size() > 0){
            driver.findElement(By.cssSelector("#root > div._4g33 > div > div > div._4g33._2pip > div:nth-child(2) > form > div > button")).click();
        }


//       post text
        Thread.sleep(5000);

//        TouchAction actions = new TouchAction(driver); !!!!111111
//
//        actions.tap(748,1204).perform();

//        actions.press(-10, -22).moveTo(2, 2).release().perform();

//        ///////////
//        //Get the size of screen.
//        Dimension size = driver.manage().window().getSize();
//        System.out.println(size);
//
//        //Find swipe x points from screen's with and height.
//        //Find x1 point which is at right side of screen.
//        int x1 = (int) (size.width * 0.20);
//        //Find x2 point which is at left side of screen.
//        int x2 = (int) (size.width * 0.80);
//
//        //Create object of TouchAction class.
//        TouchAction action = new TouchAction((MobileDriver)driver);
//
//        //Find element to swipe from right to left.
//        WebElement ele1 =  (WebElement) driver.findElementsById("com.fortysevendeg.android.swipelistview:id/front").get(3);
//        //Create swipe action chain and perform horizontal(right to left) swipe.
//        //Here swipe to point x1 Is at left side of screen. So It will swipe element from right to left.
//        action.longPress(ele1).moveTo(x1,580).release().perform();
//
//        //Find element to swipe from left to right.
//        WebElement ele2 =  (WebElement) driver.findElementsById("com.fortysevendeg.android.swipelistview:id/back").get(3);
//        //Create swipe action chain and perform horizontal(left to right) swipe.
//        //Here swipe to point x2 Is at right side of screen. So It will swipe element from left to right.
//        action.longPress(ele2).moveTo(x2,580).release().perform();
//        ////////////////

//        driver.tap(1, -10, 26, 800);

//        driver.switchTo().alert().accept();
//        driver.findElementByAccessibilityId("ALLOW").click();
//
//        for (int i =1020; i < 1120; i++){
//            for(int j=840; j<860 ; j++){
//                actions.tap(854,1026);
//            }
//        }
        Thread.sleep(3000);
//        actions.tap(854,1026);
//        tapElement(854,1026);
//        driver.performTouchAction(actions.tap(854,1026));
       // TouchAction actions = new TouchAction(driver);
//        actions.tap(  854,  1026).release().perform();

        Thread.sleep(1000);

//        WebElement El = driver.findElement(By.name("xc_message"));
//        ((RemoteWebElement) El ).setFileDetector(new LocalFileDetector());
//        El.sendKeys("/storage/emulated/0/Pictures/Screenshots/Screenshots_20171219-005213.png");



//        File file = new File("/storage/emulated/0/Pictures/Screenshots/Screenshots_20171219-005213.png");
//        Path path = Paths.get(file.getAbsolutePath());
//        try {
//            byte[] b = Base64.encodeBase64(Files.readAllBytes(path));
           // driver.findElement(By.name("xc_message"))..sendKeys();
//            driver.pushFile("/storage/emulated/0/Pictures/Screenshots/Screenshots_20171219-005213.png", b);
////            driver.pushFile("/sdcard/download/cloud-01.png", b);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        File file = new File("/storage/emulated/0/Pictures/Screenshots/Screenshots_20171219-005213.png");
//        driver.findElement(By.id("<Your input tag with type of File>")).sendKeys(file.getAbsolutePath());




//driver.pushFile(", " , "");
        Thread.sleep(1000);
        driver.findElement(By.name("view_post")).click();
        Thread.sleep(1000);



//        driver.findElement(By.cssSelector("._59te.jewel._hzb.noCount.popoverOpen ._59tf._2ftq")).click();
//        driver.findElement(By.cssSelector("#u_3_1 > div > div > div > div:nth-child(3) > div > div:nth-child(9) > a")).click();


        Thread.sleep(10000);

    }


}