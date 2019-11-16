package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private BaseFunc baseFunc;

    private final By PRODUCTS = By.xpath(".//div[@class = 'product-container']");
    private final By ADD_BTN = By.xpath(".//a[contains(@class, 'ajax_add_to_cart_button')]");

    public ProductPage(BaseFunc baseFunc){
        this.baseFunc = baseFunc;
    }

    public void selectProduct() {
        WebElement product = baseFunc.getElements(PRODUCTS).get(2);
        String productText = product.getText();
        System.out.println("The text: " + productText);
        baseFunc.hover(product);
        product.findElement(ADD_BTN).click();
//        baseFunc.getElement(ADD_BTN).click();
    }

}
