package example.objects.pages;

import example.base.BasePage;
import example.objects.elements.primitiv.StaticText;

public class MainPage extends BasePage {

    private String userInfoLocator = "descendant::input[@id='user_info']";

    public StaticText getUserInfo() {
        return new StaticText(searchElement(userInfoLocator));
    }
}
