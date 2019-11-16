package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Filter {
    private BaseFunc baseFunc;

    private final By FILTER_CATEGORY1 = By.xpath(".//label[@for = 'layered_category_4']");
    private final By FILTER_CATEGORY2 = By.xpath(".//label[@for = 'layered_category_8']");


    public Filter(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getFilterCategory1 () {
        String[] toParse = baseFunc.getElement(FILTER_CATEGORY1).getText()
                .toLowerCase()
                .split(" ");
        return toParse[0];
    }

    public String getFilterCategory2 () {
        String[] toParse = baseFunc.getElement(FILTER_CATEGORY2).getText()
                .toLowerCase()
                .split(" ");
        return toParse[0];
    }
}
