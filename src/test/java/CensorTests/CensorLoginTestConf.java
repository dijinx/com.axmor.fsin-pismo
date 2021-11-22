package CensorTests;

public class CensorLoginTestConf {
    //КОНСТАНТЫ ДАННЫХ ПОЛЬЗОВАТЕЛЯ
    public String CENSOR_LOGIN = "user1234";
    public String CENSOR_PASSWORD = "user1234";



    //КОНСТАНТЫ ЭЛЕМЕНТОВ ДЛЯ СТРАНИЦЫ АВТОРИЗАЦИИ
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


}
