package UserTests;

import CensorTests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

public class CheckPageTest extends TestBase {

    @Description(value = "Пользователь ,проверка доступности странички отправки писем")
    @Feature(value = "Пользователь, проверка доступности страницы отпраки писем")
    @Severity(SeverityLevel.BLOCKER)

    @Test
    public void checkPageAvailability() {

    }
}
