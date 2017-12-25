package applications.vaadhorim.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;

import static applications.vaadhorim.pages.EventTest.Event.CLASSROOM_EVENT;
import static applications.vaadhorim.pages.EventTest.Event.TRAVEL;
import static applications.vaadhorim.pages.EventTest.Event.VAAD_FEE;

/**
 * Created by izakos on 07/12/2016.
 */
public class EventTest extends BasePage {

    public EventTest(WebDriver driver) {
        super(driver);
    }

    public EventTest addEvent() {


        WebDriverWait wait = new WebDriverWait(driver, 30);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timelinefragment_addEvent_imageview")));
        driver.findElement(By.id("timelinefragment_addEvent_imageview")).click();

        Event event = VAAD_FEE;
        By by = null;
        switch (event) {
            case BIRTHDAY:
                by = By.id("addeventfragment_travel_imageview");
                break;
            case MEETING:
                by = By.id("addeventfragment_meeting_imageview");
                break;
            case CLASSROOM_EVENT:
                by = By.id("addeventfragment_class_enevt_imageview");
                break;
            case TRAVEL:
                by = By.id("addeventfragment_birthday_imageview");
                break;
            case VAAD_FEE:
                by = By.id("addeventfragment_vaad_fee_imageview");
                break;
            case OTHER:
                by = By.id("addeventfragment_other_imageview");
                break;
            case PRIVATE:
                by = By.id("addeventfragment_createPrivateEvent_imageview");
                break;
        }

        driver.findElement(by).click();

        driver.findElement(By.id("select_kid")).click();
        List<WebElement> date = driver.findElements(By.className("android.widget.NumberPicker"));
        date.get(0).click();
        driver.findElement(By.id("confirm_institue_3")).click();

        driver.findElement(By.id("createeventfragment_eventTitle_edittext")).sendKeys("Trip to safary");

        driver.findElement(By.id("createeventfragment_startDate_textview")).click();
        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.id("createeventfragment_endDate_textview")).click();

//        driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys("25");
//        driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys("2016");
        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.id("createeventfragment_startLocation_textview")).click();
        driver.findElement(By.id("item_added")).sendKeys("Yovel High School");
        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.id("createeventfragment_endLocation_textview")).click();
        driver.findElement(By.id("item_added")).sendKeys("Dvora Coffee Shop");
        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.id("createeventfragment_startHour_textview")).click();
        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.id("createeventfragment_endHour_textview")).click();
        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.id("createeventfragment_eventDiscription_edittext")).sendKeys("Its going To Be Cool");
        driver.navigate().back();
//        driver.findElement(By.id("createeventfragment_upload_image")).click();


        driver.findElement(By.id("createeventfragment_finish_textview")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmeventfragment_publish_button")));
        driver.findElement(By.id("confirmeventfragment_publish_button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmeventdialog_confirm_button")));
        driver.findElement(By.id("confirmeventdialog_confirm_button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timelinefragment_addEvent_imageview")));









//




        return new EventTest(driver);
    }


    public enum Event {
        TRAVEL, MEETING, CLASSROOM_EVENT, BIRTHDAY, VAAD_FEE, OTHER, PRIVATE
    }
}
