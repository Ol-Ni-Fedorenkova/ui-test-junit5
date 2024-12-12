package example.objects.pages;

import example.base.BasePage;
import example.objects.elements.primitiv.Button;
import example.objects.elements.primitiv.Input;

public class WelcomePage extends BasePage {
    private String toAuthPageLocator = "descendant::a[normalize-space(text())='Личный кабинет']";
    private String searchByNameInpLocator = "descendant::input[@placeholder='Поиск по названию']";
    private String searchBtnLocator = "descendant::button[normalize-space(text())='Найти']";

    public Button getToAuthPageBtn() {
        return new Button(searchElement(toAuthPageLocator));
    }

    public Input getSearchBuNameInp() {
        return new Input(searchElement(searchByNameInpLocator));
    }

    public Button getSearchBtn() {
        return new Button(searchElement(searchBtnLocator));
    }
}
