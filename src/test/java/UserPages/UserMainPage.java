package UserPages;

import CensorPages.PageBase;
import org.openqa.selenium.WebDriver;

public class UserMainPage extends PageBase {

    public WebDriver driver;

    public UserMainPage(WebDriver driver) {
        super(driver);
    }

    public void checkPageAvailability() {
        driver.get("");
    }

}
