package tests;

import org.testng.annotations.Test;
import utils.BaseClass;

public class FirstTest extends BaseClass {

    @Test

    public void test1() throws InterruptedException {

        createComputerPage.newComputer();
        sleep(3000);
    }
}
