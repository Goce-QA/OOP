package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClass;

public class NewTab extends BaseClass {
    @Test
    public void newTab() {
        driver.get("https://demoqa.com/browser-windows");
        String originalWindow = driver.getWindowHandle();
        Assert.assertTrue(driver.getWindowHandles().size() == 1);

        //
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabButton"))).click();
        driver.getWindowHandles().forEach(windowHandle -> driver.switchTo().window(windowHandle));

        Assert.assertTrue(driver.getWindowHandles().size() == 2);
        driver.navigate().to("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
        Assert.assertTrue(driver.getWindowHandles().size() == 1);

        driver.switchTo().window(originalWindow);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("windowButton"))).click();

        driver.getWindowHandles().forEach(windowHandle -> driver.switchTo().window(windowHandle));
        Assert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sampleHeading"))).getText(),"This is a sample page");
        driver.close();
        Assert.assertEquals(driver.getWindowHandles().size(), 1);

        driver.switchTo().window(originalWindow);
        Assert.assertEquals(driver.getTitle(), "DEMOQA");
    }
}