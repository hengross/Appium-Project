package applications.vaadhorim.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by izakos on 08/12/2016.
 */
public class ClassTest extends  BasePage{
    public ClassTest(WebDriver driver) {
        super(driver);
    }

    public ClassTest addRole() {
        // add role
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timelinefragment_addEvent_imageview")));
        driver.findElement(By.id("timelinefragment_contactPage_textview")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("classroom_chat_cp")));

        List<WebElement> list1 = driver.findElements(By.xpath("//android.widget.GridView[1]//android.widget.LinearLayout"));
        list1.get(2).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contactpageinformationfragment_addFunctionary_imageview")));
        driver.findElement(By.id("contactpageinformationfragment_addFunctionary_imageview")).click();
        driver.findElement(By.id("positionholders_name_edittext")).sendKeys("Yossi Gibor");
        driver.navigate().back();
        driver.findElement(By.id("positionholders_role_edittext")).sendKeys("Av Bait");
        driver.navigate().back();
        driver.findElement(By.id("positionholders_save_button")).click();
        driver.navigate().back();
        driver.navigate().back();
        return new ClassTest(driver);
    }
}
