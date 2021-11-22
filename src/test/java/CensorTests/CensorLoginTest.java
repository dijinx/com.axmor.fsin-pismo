package CensorTests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;


public class CensorLoginTest extends TestBase {

    CensorLoginTestConf conf = new CensorLoginTestConf();

    @Description(value = "Цензор, успешная авторизация пользователя")
    @Feature(value = "Цензор, успешная авторизация пользователя")
    @Severity(SeverityLevel.BLOCKER)


    @Test
    public void CensorLogin() throws InterruptedException {
        CensorLoginPage.openCensorAuthPage();
        CensorLoginPage.enterLogin(conf.CENSOR_LOGIN);
        CensorLoginPage.enterPassword(conf.CENSOR_PASSWORD);
        CensorLoginPage.clickButtonEnter();
        Thread.sleep(1000);
        //CensorLoginPage.checkLogo("ФСИН-ПИСЬМО");
        CensorLoginPage.checkUrl();
    }
}
