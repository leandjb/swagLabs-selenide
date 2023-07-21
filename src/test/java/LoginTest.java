import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;



class LoginTest {

    @Test
    void testLoginWithValidCredential() {

        //Given
        String url = "https://www.saucedemo.com/v1/index.html";
        Selenide.open(url);

        //When
        new LoginPage()
                .loginToStandardUser()
                .getHomeLeftMenuComponent()
                .selectLeftMenuButton();

        //Then
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assertions.assertEquals(url,currentUrl,"La URL de la página no es 'https://www.saucedemo.com/v1/index.html'");

        String currentTitle = WebDriverRunner.getWebDriver().getTitle();
        Assertions.assertEquals("Swag Labs", currentTitle, "El título de la página no es 'Swag Labs'");

    }
}
