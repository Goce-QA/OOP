package tests;

import org.testng.annotations.Test;
import utils.BaseClass;

public class HomePageTests extends BaseClass {

      @Test

    public void test1(){

          loginPage.Username();
          loginPage.Password();
          loginPage.LoginButton();
          homePage.product();

      }

}