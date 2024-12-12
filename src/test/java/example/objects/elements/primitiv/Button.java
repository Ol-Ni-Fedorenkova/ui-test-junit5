package example.objects.elements.primitiv;

import example.base.BaseElement;
import org.openqa.selenium.WebElement;

public class Button extends BaseElement {
    public Button(WebElement element) {
        super(element);
    }

    public void click() {
        getElement().click();
    }
}
