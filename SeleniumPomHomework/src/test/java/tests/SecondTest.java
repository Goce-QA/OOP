package tests;

import org.testng.annotations.Test;
import utils.BaseClass;

public class SecondTest extends BaseClass {

    @Test

    public void test2(){

        filterComputerPage.searchAndAsseart();
        sleep(3000);
    }
}
