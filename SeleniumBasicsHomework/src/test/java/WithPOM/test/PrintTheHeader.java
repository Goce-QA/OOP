package WithPOM.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import WithPOM.page.HomePage;
import WithPOM.utils.BaseClass;

public class PrintTheHeader extends BaseClass {


    @Test
    public void test1(){

        HomePage.Text();
    }

}
