package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClass;

//Open: https://demoqa.com/
//• Navigate to the alerts page
//• Click the confirm alert button
//• Verify the alert text
//• Cancel the alert
//• Verify that the operation is successfu
public class TestAlert3 extends BaseClass {

    @Test
    public void simpleAlert() {
        driver.get("https://demoqa.com/alerts");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmButton"))).click();
        String confimationalerttext = wait.until(ExpectedConditions.alertIsPresent()).getText();
        Assert.assertEquals(confimationalerttext,"Do you confirm action?");

        wait.until(ExpectedConditions.alertIsPresent()).dismiss();
        String dismiss = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmResult"))).getText();
        Assert.assertTrue(dismiss.contains("Cancel"));

    }
    @Test
    public void simpleAlert1() {
        driver.get("https://demoqa.com/alerts");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmButton"))).click();
        String confimationalerttext = wait.until(ExpectedConditions.alertIsPresent()).getText();
        Assert.assertEquals(confimationalerttext,"Do you confirm action?");

        wait.until(ExpectedConditions.alertIsPresent()).accept();
        String dismiss = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmResult"))).getText();
        Assert.assertTrue(dismiss.contains("Ok"));

    }

}
