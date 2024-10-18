package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClass;

public class TestAlert extends BaseClass {

    @Test
    public void simpleAlert() {
        driver.get("https://demoqa.com/alerts");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertButton"))).click();
        String alerttext = wait.until(ExpectedConditions.alertIsPresent()).getText();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        Assert.assertEquals(alerttext,"You clicked a button");

    }
}