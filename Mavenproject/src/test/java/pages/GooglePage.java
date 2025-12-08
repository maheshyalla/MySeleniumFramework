package pages;

import org.openqa.selenium.*;

public class GooglePage {
    WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String text) {
        driver.findElement(By.name("q")).sendKeys(text + Keys.ENTER);
    }
}