package example.base;

import example.objects.pages.WelcomePage;
import example.steps.WelcomePageSteps;
import example.utils.DriverManager;
import example.utils.PropertiesManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BaseSteps {

    public void waitVisibilityElement(BaseElement element) {
        Wait<WebDriver> wait = new FluentWait<>(DriverManager.getDriver());
        wait.until(ExpectedConditions.visibilityOf(element.getElement()));
    }

    public void setUpDriverSettings() {
        WebDriver driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().window().maximize();
    }

    public WelcomePageSteps openBaseUrl() {
        WebDriver driver = DriverManager.getDriver();
        String baseUrl = PropertiesManager.getINSTANCE().getProperties().getProperty("base.url");
        driver.get(baseUrl);
        Allure.link(baseUrl, baseUrl);
       return new WelcomePageSteps(new WelcomePage());
    }
}
