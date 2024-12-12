package example.objects.elements.primitiv;

import example.base.BaseElement;
import org.openqa.selenium.WebElement;

public class Input extends BaseElement {
    public Input(WebElement element) {
        super(element);
    }

    public void fillField(String value) {
        getElement().clear();
        getElement().click();
        getElement().sendKeys(value);
    }
}
