package example.steps;

import example.base.BaseSteps;
import example.objects.pages.MainPage;

public class MainPageSteps extends BaseSteps {
    private MainPage mainPage;

    public MainPageSteps(MainPage mainPage) {
        this.mainPage = mainPage;
        waitVisibilityElement(mainPage.getUserInfo());
    }


}
