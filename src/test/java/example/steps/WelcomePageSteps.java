package example.steps;

import example.base.BaseSteps;
import example.objects.pages.AuthPage;
import example.objects.pages.WelcomePage;
import io.qameta.allure.Step;

public class WelcomePageSteps extends BaseSteps {
    private WelcomePage welcomePage;

    public WelcomePageSteps(WelcomePage welcomePage) {
        this.welcomePage = welcomePage;
        waitVisibilityElement(welcomePage.getToAuthPageBtn());
    }

//    @Step("Переходим на страницу авторизации")
//    public AuthPageSteps toAuthPage() {
//        click(welcomePage.getToAuthPageBtn());
//        AuthPageSteps authPageSteps = new AuthPageSteps();
//        this.loadPage(PageType.AUTH);
//        authPageSteps.setAuthPage(super.getPage());
//        return authPageSteps;
//    }

    @Step("Поиск по названию \"{value}\"")
    public WelcomePageSteps searchByName(String value) {
        welcomePage.getSearchBuNameInp().fillField(value);
        welcomePage.getSearchBtn().click();
        return this;
    }

    @Step("Переходим на страницу авторизации")
    public AuthPageSteps toAuthPage() {
        welcomePage.getToAuthPageBtn().click();
        return new AuthPageSteps(new AuthPage());
    }
}
