import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class AddEmployeeTest {

    @Test
    void addEmployee() {
        Selenide.open("https://www.saucedemo.com/v1/");

        new LoginPage().loginToApplication();
    }
}
