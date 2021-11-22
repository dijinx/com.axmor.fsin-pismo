package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor jSex;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        jSex = (JavascriptExecutor) driver;
    }

    //пререйти на страницу
    public void goTo(String url) {
        driver.get(url);
    }

    //ожидаем элемент
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(elementBy)));
    }

    //ожидаем кликабельность элемента
    public void waitClickable(By elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(elementBy)));
    }


    //внести текст в поле
    public void enterText(By elementBy, String text) {
        waitVisibility(elementBy);
        WebElement field = driver.findElement(elementBy);
        field.click();
        field.clear();
        field.sendKeys(text);
    }

    //проверить ссылку - забирает образец из констант, сравнивает с полученной со страницы
    public void checkUrl(String expected) {
        String actual = driver.getCurrentUrl();
        Assertions.assertEquals(expected, actual);
    }

    //проверка данных в поле ввода(через javaScript)
    public void checkInputFieldByJs(By elementBy, String elementByJS, String text) {
        waitVisibility(elementBy);
        String Script = "return document.querySelector(" + "\"" + elementByJS + "\"" + ").value";
        String checkUserFirstName = jSex.executeScript(Script).toString();
        Assertions.assertEquals(text, checkUserFirstName);
    }

    //поиск текста на странице и проверка с эталоном
    public void checkText(By elementBy, String expectedText) {
        WebElement checkText = wait.until(ExpectedConditions.visibilityOf(driver.findElement(elementBy)));
        String text = checkText.getText();
        Assertions.assertEquals(expectedText, text);
    }

    //кликнуть по элементу
    public void click(By elementBy) {
        WebElement element = driver.findElement(elementBy);
        waitClickable(elementBy);
        element.click();
    }

    //загрузка файла
    public void loadFile(By elementBy, String path) {
        WebElement loadField = driver.findElement(elementBy);
        loadField.sendKeys(path);
    }
}
