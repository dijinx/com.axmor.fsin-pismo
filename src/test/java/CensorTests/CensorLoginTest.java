package CensorTests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;


public class CensorLoginTest extends TestBase {
    @Feature(value = "Успешная авторизация пользователя")
    @Severity(SeverityLevel.BLOCKER)

    @Test
    public void CensorLogin() throws InterruptedException {
        CensorLoginPage.openCensorAuthPage();
        CensorLoginPage.enterLogin("user1234");
        CensorLoginPage.enterPassword("user1234");
        CensorLoginPage.clickButtonEnter();
        //Thread.sleep(3000);
        CensorLoginPage.checkLogo("ФСИН-ПИСЬМО");
        CensorLoginPage.checkUrl();
    }
}
