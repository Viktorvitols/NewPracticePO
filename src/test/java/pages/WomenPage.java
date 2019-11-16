package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WomenPage {
    private BaseFunc baseFunc;

    private final By SUBCATEGORIES = By.xpath(".//a[@class = 'subcategory-name']");

    public WomenPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public WebElement getSubcategory (int i) {
        return baseFunc.getElements(SUBCATEGORIES).get(i);
    }
}
