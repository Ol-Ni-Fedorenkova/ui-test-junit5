package example.base;

import org.openqa.selenium.WebElement;

public class BaseElement {

    private WebElement element;

    protected WebElement getElement() {
        return element;
    }

    public BaseElement(WebElement element) {
        this.element = element;
    }
}
