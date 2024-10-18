package test;

import org.testng.annotations.Test;
import page.HomePage;
import utils.BaseClass;

public class PrintTheHeader extends BaseClass {




    @Test

    public void test1(){
        //HomePage homePage = new HomePage(driver);
        HomePage.text();
    }
}
