package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class LoginPage {
    private static final SelenideElement USERNAME_TXT = Selenide.$(Selectors.byName("user-name"));
    private static final SelenideElement PASSWORD_TXT = Selenide.$(Selectors.byAttribute("placeholder", "Password"));
    private static final SelenideElement LOGIN_BTN = Selenide.$("#login-button");
    private static final SelenideElement ERROR_MSN = Selenide.$(Selectors.byAttribute("data-test","error"));

    public static LoginPage getInstance(){
        return new LoginPage();
    }

    public HomePage loginWithStandardUser(){
        USERNAME_TXT.shouldBe(Condition.visible)
                .setValue("standard_user");     //Better use setValue() than sendkeys() method
        PASSWORD_TXT.shouldBe(Condition.visible)
                .setValue("secret_sauce");
        LOGIN_BTN.shouldBe(Condition.enabled)
                .click();
        ERROR_MSN.shouldNotBe(Condition.visible);

        return new HomePage();
    }
}
