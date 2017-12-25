package applications.vaadhorim.pages;

import org.openqa.selenium.By;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by izakos on 08/12/2016.
 */
public class JoinTest extends BasePage{
    public JoinTest(WebDriver driver) {
        super(driver);
    }



    public JoinTest addKid() {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.id("timelinefragment_contactPage_textview")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contactpagefragment_show_kids")));
        driver.findElement(By.id("contactpagefragment_show_kids")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.GridView[1]//android.widget.FrameLayout")));
        List<WebElement> list1 = driver.findElements(By.xpath("//android.widget.GridView[1]//android.widget.FrameLayout"));
        list1.get(0).click();

//         driver.findElement(By.id("schoolsSearch")).sendKeys(" ");
        WebElement element = driver.findElement(By.id("schoolsSearch"));
        element.sendKeys(" ");
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();

        System.out.println("X value: "+x+" Y value: "+y);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TouchAction action = new TouchAction((MobileDriver) driver).tap(x+60, y+260).release();
        action.perform();



        driver.findElement(By.id("grade_f")).click();
        driver.findElement(By.id("class_number_c")).click();
        driver.findElement(By.id("kidsName")).sendKeys("Yoka");
        driver.findElement(By.id("gender_switch")).click();
        driver.findElement(By.id("next_button")).click();
        driver.findElement(By.id("confirm_create")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("main_screen")));
        driver.findElement(By.id("main_screen")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timelinefragment_addEvent_imageview")));
        return new JoinTest(driver);
    }
}
