package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    private BaseFunc baseFunc;

    private final By WOMEN = By.xpath(".//a[@title = 'Women']");

    public HomePage (BaseFunc baseFunc){
        this.baseFunc = baseFunc;
    }

    public void openWomenPage () {
        baseFunc.click(WOMEN);
    }
}
