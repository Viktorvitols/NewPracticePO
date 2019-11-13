import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;

public class APWebsiteTest {

    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage = new HomePage(baseFunc);

    @Test
    public void AutoPractTest() {

        baseFunc.goToURL("automationpractice.com");
        homePage.openWomenPage();



//        baseFunc.close();
    }
}
