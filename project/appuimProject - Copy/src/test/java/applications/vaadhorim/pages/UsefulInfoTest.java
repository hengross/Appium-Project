package applications.vaadhorim.pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by izakos on 08/12/2016.
 */
public class UsefulInfoTest extends BasePage {
    public UsefulInfoTest(WebDriver driver) {
        super(driver);
    }

    public UsefulInfoTest sendUsefulInfoMessage() {
        // adding useful info
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timelinefragment_addEvent_imageview")));
        driver.findElement(By.id("mainactivity_mainToggle_imageview")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sidedrawer_usefulInfo_textview")));
        driver.findElement(By.id("sidedrawer_usefulInfo_textview")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usefulInformationFragment_addMessage_textview")));
        driver.findElement(By.id("usefulInformationFragment_addMessage_textview")).click();
        driver.findElement(By.id("AddInfoMessageFragment_title_edittext")).sendKeys("some message");
        driver.findElement(By.id("AddInfoMessageFragment_description_edittext")).sendKeys("some description");
        driver.findElement(By.id("mainactivity_edit_textview")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usefulInformationFragment_addMessage_textview")));
        driver.navigate().back();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timelinefragment_addEvent_imageview")));
        return new UsefulInfoTest(driver);
    }
}
