package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseFunc {
    private WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goToURL(String url) {
        if (url.startsWith("http") || url.startsWith("https")) {
        } else {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public void click(By locator) {
        getElement(locator).click();
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> getElements(By locator) {
        Assertions.assertFalse(driver.findElements(locator).isEmpty(), "No element found");
        return driver.findElements(locator);
    }

    public List<WebElement> getChildElements(By locatorParent, By locatorChild) {

        Assertions.assertFalse(driver.findElements(locatorParent)
                .isEmpty(), "No Parent Element");
        Assertions.assertFalse(driver.findElement(locatorParent)
                .findElements(locatorChild)
                .isEmpty(), "No child elements");

        return driver.findElement(locatorParent).findElements(locatorChild);
    }


    public void hover(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void close() {
        driver.close();
    }

    public void timeout() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}
