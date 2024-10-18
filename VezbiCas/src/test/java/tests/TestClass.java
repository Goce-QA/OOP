package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPageClass;
import utils.BaseClass;
import utils.DataProvidersClass;

public class TestClass extends BaseClass {


    @Test(dataProvider = "login",dataProviderClass = DataProvidersClass.class)
    public void test1(String username,String password) {
        LoginPageClass login = new LoginPageClass(driver,wait,assertt);
        login.username(username);
        login.passsword(password);
        login.loginButton();
        String getText = login.verifyBackpack();
        assertt.assertEquals(getText,"Sauce Labs Backpack");

    }




}