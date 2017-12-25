package applications.vaadhorim.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import android.app.Activity;
//import android.content.Context;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.Toast;
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
//import javax.naming.Context;

public class loopFBtest extends AndroidSetup {

        @BeforeClass
        public void setUp() throws Exception {
            test();
        }

        public void test() throws Exception {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome"); //choose in witch browser to open the test (chrome, browser, fierfox)
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.2"); //the number represent the version of the android device for example: "emulator 4.4.2"/ "nexus 5.1.1"
            caps.setCapability("platformName", "Android");
            caps.setCapability("deviceName", "emulator-5554");
            driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps); //the port has to be same to the port in appium server
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            SaveDeviceData deviceData = new SaveDeviceData();
        }

        @AfterClass
        public void tearDown() throws Exception {
            driver.quit();
        }

        @Test
        public void falseLoginTest() throws InterruptedException, IOException {
            String baseurl = "https://www.facebook.com";
            driver.get(baseurl);
            driver.findElement(By.id("m_login_email")).sendKeys("cyber.infom1.il@gmail.com");
            Thread.sleep(8000);
            driver.findElement(By.name("pass")).sendKeys("Info.Media");
            Thread.sleep(3500);
            driver.findElement(By.name("login")).click();
            Thread.sleep(10000);

            // pass the login page
            // sometimes goes to different page that contain question - "are you...?"
            // if the page contains that question than - click ok
            // else: go on

            String text = "Log In With One Tap";
            List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
            if(list.size() > 0){
                driver.findElement(By.cssSelector("#root > div._4g33 > div > div > div._4g33._2pip > div:nth-child(2) > form > div > button")).click();
            }

            saveRunningData savedata = new saveRunningData();

            Thread.sleep(5000);
            int  numberOfPosts = 10;
            int currentNumPost = 0;
            /*
                post text x times
                every post saved in csv file with time and content
             */
            while (currentNumPost < numberOfPosts ) {
                DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss");
                Date dateNow = new Date();
                String timeToPost = dateFormat.format(dateNow);
                String stringToPost = "hey everyone! the time now is " + timeToPost;
                driver.findElement(By.name("xc_message")).sendKeys(stringToPost);
                savedata.addRow(timeToPost, "text post on facebook" , stringToPost);
                Thread.sleep(1000);
                driver.findElement(By.name("view_post")).click(); //click to post
                Thread.sleep(10000); //wait x seconds from one action to the next one
                currentNumPost++; //increase the number of times we post on facebook in the current test
            }
            Thread.sleep(10000);

        }
    }