package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseClass;

public class LoginPageTest extends BaseClass {

    @Test
    public void test2(){

       loginPage.Username();
       loginPage.Password();
       loginPage.LoginButton();
    }
}
