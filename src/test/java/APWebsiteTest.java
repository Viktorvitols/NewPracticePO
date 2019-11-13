import org.junit.jupiter.api.Test;
import pages.BaseFunc;

public class APWebsiteTest {

    @Test
    public void AutoPractTest() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.goToURL("automationpractice.com");


        baseFunc.close();
    }
}
