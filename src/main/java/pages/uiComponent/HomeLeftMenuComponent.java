package pages.uiComponent;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class HomeLeftMenuComponent {
    private static final SelenideElement MENU_BTN = Selenide.$(".bm-burger-button > button:nth-child(2)");
    private static final SelenideElement LOGOUT_OPTION = Selenide.$(Selectors.byId("logout_sidebar_link"));

    public void selectLeftMenuButton(){

        MENU_BTN.click();
        LOGOUT_OPTION.shouldBe(Condition.visible).click();

    }
}
