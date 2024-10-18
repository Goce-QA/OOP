package tests;
//https://demoqa.com/alerts
//• Click the prompt alert button
//• Verify the alert text
//• Enter some text
//• Verify that the operation is successful

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClass;

public class TestAlert2 extends BaseClass {

    @Test
    public void simpleAlert() throws InterruptedException {

    driver.get("https://demoqa.com/alerts");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("promtButton"))).click();
    String promptalerttext = wait.until(ExpectedConditions.alertIsPresent()).getText();
    Assert.assertEquals(promptalerttext,"Please enter your name");
    Thread.sleep(2000);
    wait.until(ExpectedConditions.alertIsPresent()).sendKeys("Goce");
    wait.until(ExpectedConditions.alertIsPresent()).accept();
    String result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("promptResult"))).getText();
    Assert.assertTrue(result.contains("Goce"));

}
}