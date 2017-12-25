package applications.vaadhorim.pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by izakos on 08/12/2016.
 */
public class ChatTest extends BasePage {
    public ChatTest(WebDriver driver) {
        super(driver);
    }

    public ChatTest sendTextMessages() {
        // send chet messages
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(By.id("classroom_chat")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("messageInput")));
        driver.findElement(By.id("messageInput")).sendKeys("message1");
        driver.navigate().back();
        driver.findElement(By.id("sendButton")).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("messageInput")));
        driver.findElement(By.id("messageInput")).sendKeys("message2");
        driver.navigate().back();
        driver.findElement(By.id("sendButton")).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("messageInput")));
        driver.findElement(By.id("messageInput")).sendKeys("message3");
        driver.navigate().back();
        driver.findElement(By.id("sendButton")).click();
        driver.findElement(By.id("back")).click();

        return new ChatTest(driver);
    }
}

