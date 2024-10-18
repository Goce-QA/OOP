package test;


import org.testng.annotations.Test;

import utils.BaseClass;

public class EndToEndTest extends BaseClass {

    @Test
    public void test()  {
        sleep(500);
        homePage.Username();
        sleep(500);
        homePage.Password();
        sleep(500);
        homePage.LoginButton();
        sleep(500);
        homePage.Purchase();
    }
}
