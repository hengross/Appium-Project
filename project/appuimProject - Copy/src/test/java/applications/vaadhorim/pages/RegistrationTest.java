package applications.vaadhorim.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by izakos on 29/11/2016.
 *
 * http://www.apkmirror.com/apk/google-inc/chrome/
 */
public class RegistrationTest extends applications.vaadhorim.pages.BasePage {

    public RegistrationTest(WebDriver driver) {
        super(driver);
    }

    public RegistrationTest invalidRegistration() {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("registrationactivity_registraion_button")));
        driver.findElement(By.id("registrationactivity_registraion_button")).click();
        driver.findElement(By.id("first_name_et")).sendKeys("John");
        driver.findElement(By.id("last_name_et")).sendKeys("lucky");
        driver.findElement(By.id("fpv_send_phone_et")).sendKeys("0522222222");
        driver.navigate().back();
        driver.findElement(By.id("fpv_send_phone_bt")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fvc_phone_verification_et")));
//        driver.findElement(By.id("fvc_phone_verification_et")).sendKeys("username");

        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(By.id("fvc_phone_verification_et")).getText().length() == 4;
            }
        });


        driver.findElement(By.id("fvc_send_phone_bt")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timelinefragment_addEvent_imageview")));


        return new RegistrationTest(driver);
    }
}