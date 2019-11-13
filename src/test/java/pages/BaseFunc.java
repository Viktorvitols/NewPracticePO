package pages;

import org.openqa.selenium.WebDriver;
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

    public void close() {
        driver.close();
    }
}
