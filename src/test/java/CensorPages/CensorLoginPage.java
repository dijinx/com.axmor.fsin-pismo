package CensorPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CensorLoginPage extends PageBase {

    public WebDriver driver;

    public CensorLoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    //КОНСТАНТЫ ДЛЯ СТРАНИЦЫ АВТОРИЗАЦИИ
    //страница авторизации
    public String CENSOR_AUTH_URL = "https://fsin-pismo.axmor.com/fsin-censor/auth";
    //страница при успешной авторизации
    public String CENSOR_SUCCESSFULLY_AUTH_URL = "https://fsin-pismo.axmor.com/fsin-censor/";
    //поле "Логин"
    public String INPUT_CENSOR_LOGIN_XPT = "//*[@type=\"text\"]";
    //поле "Пароль"
    public String INPUT_CENSOR_PASSWORD_XPT = "//*[@type=\"password\"]";
    //кнопка "Войти"
    public String BTN_ENTER_ID = "authorization-form-submit";


    //МЕТОДЫ ДЛЯ СТРАНИЦЫ АВТОРИЗАЦИИ
    //открыть страницу авторизации Цензора
    public void openCensorAuthPage() {
        goTo(CENSOR_AUTH_URL);
    }

    //внести логин в поле "Логин"
    public void enterLogin(String login) {
        enterText(By.xpath(INPUT_CENSOR_LOGIN_XPT), login);
    }

    //внести пароль в поле "Пароль"
    public void enterPassword(String password) {
        enterText(By.xpath(INPUT_CENSOR_PASSWORD_XPT), password);
    }

    //нажать кнопку "Войти"
    public void clickButtonEnter() {
        click(By.id(BTN_ENTER_ID));
    }

    //проверить адрес страницы
    public void checkUrl() throws InterruptedException {
        checkUrl(CENSOR_SUCCESSFULLY_AUTH_URL);
    }

   //проверить заголовок страницы
    public void checkLogo(String logoText){
        checkText(By.xpath("//*[@textcolor=\"inherit\"]"), logoText);
    }
}
