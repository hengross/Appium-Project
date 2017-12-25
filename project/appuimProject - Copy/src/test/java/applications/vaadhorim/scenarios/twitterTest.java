package applications.vaadhorim.scenarios;

/**
 * Created by Amit on 06/12/2017.
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
        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.List;
        import java.util.concurrent.TimeUnit;


public class twitterTest extends AndroidSetup {

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
        SaveDeviceData deviceData = new SaveDeviceData();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void falseLoginTest() throws InterruptedException {
        saveRunningData savedata = new saveRunningData();
        String baseurl = "https://twitter.com/?lang=he";
        driver.get(baseurl);
        driver.findElement(By.cssSelector("#react-root > div > main > div > div > div.TlmtDTCq.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div > div._2ZZR2W6-._3TtLnXY8.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div._4BxUDNoz.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div > div")).click();

//        driver.findElement(By.cssSelector("#react-root > div > main > div > div > div.TlmtDTCq.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div > div._4BxUDNoz.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div > div")).click();
        driver.findElement(By.name("session[username_or_email]")).sendKeys("cyberInfom2il");
//        Thread.sleep(8000);
        driver.findElement(By.name("session[password]")).sendKeys("Info.Media");
//        Thread.sleep(3500);
        driver.findElement(By.cssSelector("#react-root > div > main > div > div > form > div > div.MmJh82_T._3-g0ncC4._1pzUva68.SpbPGaHr._2Rz0TobF._1qpWiIkN.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-1loqt21.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div")).click();

//        Thread.sleep(10000);

        // pass the login page
        //sometimes goes to different page that contain question - "are you...?"
        // if the page contains that question than - click ok
        //else: go on

//        String text = "Log In With One Tap";
//        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
//        if(list.size() > 0){
//            driver.findElement(By.cssSelector("#root > div._4g33 > div > div > div._4g33._2pip > div:nth-child(2) > form > div > button")).click();
//        }
//
        //click on the button to post
        driver.findElement(By.cssSelector("#react-root > div._2FU3NGw4 > div > div > a > div")).click();
//
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss");
        Date dateNow = new Date();
        String timeToPost = dateFormat.format(dateNow);
        String stringToPost = "היום סיור ירושלים " + timeToPost;
//       post text
//        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#react-root > div > main > div > div > div._3xujJ3kq.-UhQDiIZ.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div > div._3_SrVo8B._335TEFTc._3Ho4vlTO.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div.mgNmY_M-._2rKrV7oY.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div > div > div > textarea")).sendKeys(stringToPost);

        savedata.addRow(timeToPost, "text post on twitter" , stringToPost);
//        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#react-root > div > main > div > div > div:nth-child(1) > div._2WpbeAAU.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div > div > div._2y4c8Vla.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti > div > div.MmJh82_T._1xFtK706._1pzUva68.SpbPGaHr._2Rz0TobF._2m0B23vv.rn-1oszu61.rn-1efd50x.rn-14skgim.rn-rull8r.rn-mm0ijv.rn-13yce4e.rn-fnigne.rn-ndvcnb.rn-gxnn5r.rn-deolkf.rn-1loqt21.rn-6koalj.rn-1pxmb3b.rn-7vfszb.rn-eqz5dr.rn-1mnahxq.rn-61z16t.rn-p1pxzi.rn-11wrixw.rn-ifefl9.rn-bcqeeo.rn-wk8lta.rn-9aemit.rn-1mdbw0j.rn-gy4na3.rn-bnwqim.rn-1lgpqti")).click();
//
//        Thread.sleep(10000);

    }


}
