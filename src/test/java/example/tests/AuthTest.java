package example.tests;

import example.base.BaseSteps;
import example.base.BaseTest;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthTest extends BaseTest {
    private final BaseSteps steps = STEPS.get();

    @Test
    @Feature("Проверка авторизации")
    @DisplayName("Авторизация")
    public void authTest() {
        steps
                .openBaseUrl()
                .toAuthPage()
                .submit("log", "pass");
    }
}
