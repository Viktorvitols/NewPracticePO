package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

    public WebElement getElement (By locator) {
        return driver.findElement(locator);
    }

    public void close() {
        driver.close();
    }
}
