package example.objects.pages;

import example.base.BasePage;
import example.objects.elements.primitiv.Button;
import example.objects.elements.primitiv.Input;

public class AuthPage extends BasePage {

    private String loginInputLocator = "descendant::input[@id='Login']";
    private String passwordInputLocator = "descendant::input[@id='Password']";
    private String submitBtnLocator = "descendant::button[normalize-space(text())='Вход']";

    public Input getLoginInp() {
        return new Input(searchElement(loginInputLocator));
    }

    public Input getPasswordInp() {
        return new Input(searchElement(passwordInputLocator));
    }

    public Button getSubmitBtn() {
        return new Button(searchElement(submitBtnLocator));
    }
}
