package CensorTests;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class NotTestUserSendLetter extends TestBase {

    @Test
    public void UserSendLetter() throws InterruptedException {
        //ЗАЙТИ НА САЙТ
        driver.get("https://fsin-pismo.axmor.com/client/app/letter/create");
        //ВЫБРАТЬ ОБЛАСТЬ
        driver.findElement(By.xpath("//*[@value=1]")).click();
        //ВЫБРАТЬ УЧЕРЕЖДЕНИЕ
        driver.findElement(By.xpath("//*[@value=1 and text()=\"СИЗО-1 Кресты\"]")).click();
        //ВНЕСТИ ФАМИЛИЮ АДРЕСАТА
        driver.findElement(By.xpath("//*[@name=\"sender.lastName\"]")).sendKeys("фамилия");
        //ВНЕСТИ ИМЯ АДРЕСАТА
        driver.findElement(By.xpath("//*[@name=\"sender.firstName\"]")).sendKeys("имя");
        //ВНЕСТИ ОТЧЕСТВО АДРЕСАТА
        driver.findElement(By.xpath("//*[@name=\"sender.middleName\"]")).sendKeys("отчество");
        //ВНЕСТИ ДАТУ РОЖДЕНИЯ АДРЕСАТА
        driver.findElement(By.xpath("//*[@value=\"2007\"]")).click();
        //ВНЕСТИ ФИО ОТПРАВИТЕЛЯ
        driver.findElement(By.xpath("//*[@name=\"author.name\"]")).sendKeys("ФИО ОТПРАВИТЕЛЯ");
        //ВНЕСТИ ТЕЛЕФОННЫЙ НОМЕР ОТПРАВИТЕЛЯ
        driver.findElement(By.xpath("//*[@placeholder=\"Номер телефона\"]")).sendKeys("+79999999999");
        //ВНЕСТИ ПОЧТУ ОТПРАВИТЕЛЯ
        driver.findElement(By.xpath("//*[@name=\"author.email\"]")).sendKeys("dvaxmor@gmail.com");
        //ВНЕСТИ ПОДТВЕРЖДЕНИЕ ПОЧТЫ ОТПРАВИТЕЛЯ
        driver.findElement(By.xpath("//*[@name=\"author.email2\"]")).sendKeys("dvaxmor@gmail.com");
        //ВНЕСТИ ТЕКСТ ПИСЬМА
        driver.findElement(By.xpath("//*[@name=\"letter\"]")).sendKeys("AUTOTEST");
        //ВНЕСТИ НОМЕР КАРТЫ
        driver.findElement(By.xpath("//*[@placeholder=\"Номер карты\"]")).sendKeys("2500039");
        //ВНЕСТИ ПИН КАРТЫ
        driver.findElement(By.xpath("//*[@placeholder=\"Код авторизации\"]")).sendKeys("7832");
        //ЗАГРУЗИТЬ ФАЙЛ ФОТО (Если нужно проверить с фото)
        driver.findElement(By.xpath("//*[@accept=\"image/jpeg,image/png,image/gif\"]"))
                .sendKeys("C:\\java_projects\\fsin-letter\\src\\test\\java\\resources\\test_picture.jpeg");
        //ОТМЕТИТЬ ЧЕК-БОКС (Если нужно проверить с ответом)
        driver.findElement(By.xpath("//*[@name=\"isAnswerOrdered\"]")).click();
        //НАЖАТЬ КНОПКУ ОТПРАВИТЬ ПИСЬМО
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        //НУ ПАУЗА НА 2 СЕК
        Thread.sleep(2000);
        //НАЖАТЬ КНОПКУ ОПЛАТИТЬ ПИСЬМО
        driver.findElement(By.xpath("//*[@class=\"ci_submit left\"]")).click();
    }
}
