import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class APWebsiteTest {

    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage = new HomePage(baseFunc);
    private WomenPage womenPage = new WomenPage(baseFunc);
    private Filter filter = new Filter(baseFunc);
    private ProductPage productPage = new ProductPage(baseFunc);

    @Test
    public void AutoPractTest() {

        baseFunc.goToURL("automationpractice.com");
        homePage.openWomenPage();
        baseFunc.timeout();

        String subcategory1 = womenPage.getSubcategory(0).getText().toLowerCase();
        String subcategory2 = womenPage.getSubcategory(1).getText().toLowerCase();
        String filterCategory1 = filter.getFilterCategory1();
        String filterCategory2 = filter.getFilterCategory2();

        Assertions.assertEquals(subcategory1, filterCategory1, "Category 1 does not match filter name");
        Assertions.assertEquals(subcategory2, filterCategory2, "Category 2 does not match filter name");

        productPage.selectProduct();



//        baseFunc.close();
    }
}
