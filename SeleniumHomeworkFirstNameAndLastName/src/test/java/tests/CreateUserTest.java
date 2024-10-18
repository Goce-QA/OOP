package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClassLogin;
import utils.DataProviders;

public class CreateUserTest extends BaseClassLogin {
    String messageCreateNewUser = "Please verify reCaptcha to register!";

    @Test(dataProvider = "newUserData", dataProviderClass = DataProviders.class)
    public void createNewUser(String newFirstName, String newLastName, String newUserNameData, String newPasswordData) {
        scrollDown(200);
        sleep(1000);
        creatUserPage.newUserButton();
        sleep(1000);
        scrollDown(300);
        creatUserPage.newUserFirstName(newFirstName);
        sleep(1000);
        creatUserPage.newUserLastName(newLastName);
        sleep(1000);
        creatUserPage.newUserName(newUserNameData);
        sleep(1000);
        creatUserPage.newUserPassword(newPasswordData);
        sleep(2000);
        creatUserPage.registerButoon();
        sleep(1000);

        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='mb-1']")).getText() , messageCreateNewUser);
        System.out.println("\n"+"Assertion has passed"+"\n");
    }
}


