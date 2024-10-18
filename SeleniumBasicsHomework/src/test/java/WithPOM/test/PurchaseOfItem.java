package WithPOM.test;

import WithPOM.page.HomePage;
import WithPOM.utils.BaseClass;
import org.testng.annotations.Test;

public class PurchaseOfItem extends BaseClass {
    @Test
    public void test() throws InterruptedException {
        HomePage.Purchase();
    }
}
