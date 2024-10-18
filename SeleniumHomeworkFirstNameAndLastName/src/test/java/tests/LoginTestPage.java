package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClassLogin;
import utils.DataProviders;

public class LoginTestPage extends BaseClassLogin {
    String messageFromLogin = "Invalid username or password!";

    @Test(dataProvider = "userData", dataProviderClass = DataProviders.class)
    public void loginWithUserNameAndPassword(String userNameData, String passwordData) {
        scrollDown(200);
        sleep(1000);
        loginPage.userName(userNameData);
        sleep(1000);
        loginPage.userPassword(passwordData);
        sleep(2000);
        loginPage.clickButoon();
        sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='mb-1']")).getText() , messageFromLogin);
        System.out.println("\n"+"Assertion has passed"+"\n");
    }
}
