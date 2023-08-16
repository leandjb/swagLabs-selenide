import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.testng.TextReport;
import com.codeborne.selenide.testng.annotations.Report;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import pages.LoginPage;


@Listeners({TextReport.class})
@Report
class LoginTest {
    @Test
    void testLoginWithValidCredential() {

        //Given
        String url = "https://www.saucedemo.com/v1/index.html";
        Selenide.open(url);

        //When
        LoginPage.getInstance()
                .loginWithStandardUser()
                .getHomeLeftMenuComponent()
                .selectLeftMenuButton();

        //Then
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(url,currentUrl,"La URL de la página no es 'https://www.saucedemo.com/v1/index.html'");

        String currentTitle = WebDriverRunner.getWebDriver().getTitle();
        Assert.assertEquals("Swag Labs", currentTitle, "El título de la página no es 'Swag Labs'");
    }
}
