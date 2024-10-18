package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClass;

public class WindowsTest extends BaseClass {

    @Test
    public void newWindowHandle() {
        driver.get("https://demoqa.com/browser-windows");

        String originalWindow = driver.getWindowHandle();

        //generalHelpers.scrollDown(250);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("windowButton"))).click();

        // One way to navigate through every window/tab using forEach
        driver.getWindowHandles().forEach(windowHandle -> driver.switchTo().window(windowHandle));

        // Second way to iterate through browser window/tab with exiting the loop
        for(String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Alternative way to iterate through browser window/tab with exiting the loop
        String[] windowHandles = driver.getWindowHandles().toArray(new String[0]);
        for(int i = 0; i < windowHandles.length; i++){
            String window = windowHandles[i];

            if(!originalWindow.contentEquals(window)){
                driver.switchTo().window(window);
                break;
            }
        }

        String newTabMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sampleHeading"))).getText();
        Assert.assertEquals(newTabMessage, "This is a sample page");

        driver.close();

        driver.switchTo().window(originalWindow);

        Assert.assertEquals(driver.getTitle(), "DEMOQA");
    }
}
