package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.BaseClass;
//Open: https://demoqa.com/
//Navigate to the Frames page
//Verify the text in the first frame
//Verify the text in the second frame

public class iFrames extends BaseClass {
    public SoftAssert assertt=new SoftAssert();
    @Test
            public void iFrame() throws InterruptedException{
        driver.navigate().to("https://demoqa.com/frames");
        String originalHeading = driver.getWindowHandle();
        driver.switchTo().frame("frame1");
        String firstFrame = driver.findElement(By.id("sampleHeading")).getText();
        assertt.assertEquals("This is a sample page", firstFrame);
        driver.switchTo().window(originalHeading);
        driver.switchTo().frame("frame2");
        String secondFrame = driver.findElement(By.id("sampleHeading")).getText();
        assertt.assertEquals("This is a sample page", firstFrame);

    }

}
