package example.base;

import example.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    public WebElement searchElement(String locator) {
        return DriverManager.getDriver().findElement(By.xpath(locator));
    }
}
