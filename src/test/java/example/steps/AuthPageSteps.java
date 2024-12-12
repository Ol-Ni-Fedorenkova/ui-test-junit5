package example.steps;

import example.base.BaseSteps;
import example.objects.pages.AuthPage;
import example.objects.pages.MainPage;

public class AuthPageSteps extends BaseSteps {
    private AuthPage authPage;

    public AuthPageSteps(AuthPage authPage) {
        this.authPage = authPage;
        waitVisibilityElement(authPage.getLoginInp());
    }

    public MainPageSteps submit(String log, String pass) {
        authPage.getLoginInp().fillField(log);
        authPage.getPasswordInp().fillField(pass);
        authPage.getSubmitBtn().click();
        return new MainPageSteps(new MainPage());
    }
}
